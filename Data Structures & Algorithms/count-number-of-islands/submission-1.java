class Solution {
    int rl;
    int cl;
    public int numIslands(char[][] grid) {
        rl = grid.length;
        cl = grid[0].length;
        int res = 0;
        for(int r = 0; r < rl; r++){
            for(int c = 0; c < cl; c++){
                if(grid[r][c] == '1'){
                    res++;
                    dfs(grid, r, c);
                }
            }
        }

        return res;
    }
    void dfs(char[][] grid, int r, int c){
        if(r < 0 || c < 0 || r == rl || c == cl || grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
        return;
    }
}
