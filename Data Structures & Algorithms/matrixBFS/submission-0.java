class Solution {
    int rl;
    int cl;
    public int shortestPath(int[][] grid) {
        rl = grid.length;
        cl = grid[0].length;
        Deque<int[]> q = new ArrayDeque<>();
        int[][] visit = new int[rl][cl];
        q.add(new int[2]);
        visit[0][0] = 1;

        int[][] direct = {{1, 0},{-1, 0},{0, 1},{0, -1}};
        int res = 0;

        while(!q.isEmpty()){
            int qlen = q.size();
            for(int i = 0; i < qlen; i++){
                int[] cord = q.poll();
                int r = cord[0];
                int c = cord[1];
                if(r == rl - 1 && c == cl - 1){
                    return res;
                }
                for(int j = 0; j < 4; j++){
                    int newr = r + direct[j][0];
                    int newc = c + direct[j][1];
                    if(newc < 0 || newr < 0 || newc == cl || newr == rl || visit[newr][newc] == 1 || grid[newr][newc] == 1) {
                        continue;
                    }
                    visit[newr][newc] = 1;
                    q.add(new int[]{newr, newc});
                }

            }
            res++;
        }

        return -1;
    }
}
