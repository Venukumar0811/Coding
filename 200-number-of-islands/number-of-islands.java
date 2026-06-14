class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    count++;

                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{r, c});
                    grid[r][c] = '0';

                    while (!q.isEmpty()) {
                        int[] cur = q.poll();

                        for (int[] d : dirs) {
                            int nr = cur[0] + d[0];
                            int nc = cur[1] + d[1];

                            if (nr >= 0 && nc >= 0 &&
                                nr < rows && nc < cols &&
                                grid[nr][nc] == '1') {

                                grid[nr][nc] = '0';
                                q.offer(new int[]{nr, nc});
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}
