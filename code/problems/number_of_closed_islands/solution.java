class Solution {
    int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int noOfClosedIslands = 0;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        int notAnEdgeIsland = Integer.MAX_VALUE;

        //mark all islands on edge
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 || visited[i][j]) continue;

                if (i * j == 0 || i == m - 1 || j == n - 1) {
                    q.offer(new int[] { i, j });
                    visited[i][j] = true;
                    bfs(grid, q, visited);
                }

            }
        }

        //count all islands that are not on edge they are closed islands
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0 && !visited[i][j]) {
                    q.offer(new int[] { i, j });
                    visited[i][j] = true;
                    bfs(grid, q, visited);

                    noOfClosedIslands++;
                }

            }
        }

        System.out.println(noOfClosedIslands);

        return noOfClosedIslands;
    }

    private boolean bfs(int[][] grid, Queue<int[]> q, boolean[][] visited) {
        boolean a = true;
        while (!q.isEmpty()) {
            int[] point = q.poll();

            for (int[] dir : dirs) {
                int x = dir[0] + point[0];
                int y = dir[1] + point[1];

                if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 1 || visited[x][y]) {
                    a = false;
                    continue;
                }

                q.offer(new int[] { x, y });
                visited[x][y] = true;
            }
        }

        return a;
    }
}
