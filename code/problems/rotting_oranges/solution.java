class Solution {
    private static final int EMPTY = 0;
    private static final int FRESH = 1;
    private static final int ROTTEN = 2;

    int[][] DIRECTIONS = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return -1;

        int time = 0;
        int fresh = 0;

        Queue<int[]> q = new LinkedList<>();

        int numberOfRows = grid.length, numberOfColumns = grid[0].length;

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if (grid[i][j] == ROTTEN) {
                    q.offer(new int[] { i, j });
                } else if (grid[i][j] == FRESH) fresh++;
            }
        }

        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] point = q.poll();
                for (int[] direction : DIRECTIONS) {
                    int r = direction[0] + point[0];
                    int c = direction[1] + point[1];

                    if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0 || grid[r][c] == 2) continue;

                    grid[r][c] = ROTTEN;
                    q.add(new int[] { r, c });
                    fresh--;
                }
            }
            time++;
        }

        return fresh == 0 ? time : -1;
    }
}
