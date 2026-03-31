class Solution {
    int rl;
    int cl;
    public int maxAreaOfIsland(int[][] grid) {
        rl = grid.length;
        cl = grid[0].length;
        int res = 0;
        for(int r = 0; r < rl; r++){
            for(int c = 0; c < cl; c++){
                if(grid[r][c] == 1){
                    res = Math.max(dfs(grid, r, c), res);
                }
            }
        }

        return res;
    }

    int dfs(int[][] grid, int r, int c){
        if(r < 0 || c < 0 || r == rl || c == cl || grid[r][c] == 0){
            return 0;
        }
        int count = 1;
        grid[r][c] = 0;
        count += dfs(grid, r - 1, c);
        count += dfs(grid, r + 1, c);
        count += dfs(grid, r, c - 1);
        count += dfs(grid, r, c + 1);
        return count;
    }
}
