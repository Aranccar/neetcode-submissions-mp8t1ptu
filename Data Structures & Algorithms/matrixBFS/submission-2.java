class Solution {
    public int shortestPath(int[][] grid) {

        int rlen = grid.length;
        int clen = grid[0].length;
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[2]);
        int[][] visit = new int[rlen][clen];
        visit[0][0] = 1;
        int res = 0;
        while(!q.isEmpty()){
            int curlen = q.size();
            for(int i = 0; i < curlen; i++){
                int[] cor = q.poll();
                int r = cor[0];
                int c = cor[1];
                if(r == rlen - 1 && c == clen - 1){
                    return res;
                }
                int[][] neighbors = {{r, c + 1}, {r, c - 1}, {r + 1, c}, {r - 1, c}};
                for(int j = 0; j < 4; j++){
                    int newr = neighbors[j][0];
                    int newc = neighbors[j][1];
                    if(newr < 0 || newc < 0 || newr == rlen || newc == clen || grid[newr][newc] == 1){
                        continue;
                    }
                    int[] newcor = {newr, newc};
                    q.add(newcor);
                    grid[newr][newc] = 1;
                }
            }
            res++;
        }
        return -1;
    }
}
