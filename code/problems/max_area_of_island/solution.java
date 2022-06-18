class Solution {
    int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int noOfIslands = 0;

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 1 || visited[i][j]) continue;
                q.offer(new int[] { i, j });
                visited[i][j] = true;
                int area = bfs(grid, q, visited);
                maxArea = Math.max(maxArea, area);
                noOfIslands++;
            }
        }

        System.out.println(noOfIslands);

        return maxArea;
    }

    private int bfs(int[][] grid, Queue<int[]> q, boolean[][] visited) {
        int area = 0;

        while (!q.isEmpty()) {
            int[] point = q.poll();

            for (int[] dir : dirs) {
                int x = point[0] + dir[0];
                int y = point[1] + dir[1];

                if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0 || visited[x][y]) continue;

                q.offer(new int[] { x, y });
                visited[x][y] = true;
                
            }

            area++;
        }

        return area;
    }
}
