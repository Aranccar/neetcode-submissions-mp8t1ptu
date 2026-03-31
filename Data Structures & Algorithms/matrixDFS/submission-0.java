class Solution {
    int rl;
    int cl;
    public int countPaths(int[][] grid) {
        rl = grid.length;
        cl = grid[0].length;
        int[][] visit = new int[rl][cl];
        return dfs(grid, 0, 0, visit);
    }

    int dfs(int[][] grid, int r, int c, int[][] visit){
        if(r < 0 || c < 0 || r == rl || c == cl || grid[r][c] == 1 || visit[r][c] == 1){
            return 0;
        }
        if(r == rl - 1 && c == cl - 1){
            return 1;
        }
        int count = 0;
        visit[r][c] = 1;
        count += dfs(grid, r - 1, c, visit);
        count += dfs(grid, r + 1, c, visit);
        count += dfs(grid, r, c - 1, visit);
        count += dfs(grid, r, c + 1, visit);
        visit[r][c] = 0;
        return count;
    }
}
