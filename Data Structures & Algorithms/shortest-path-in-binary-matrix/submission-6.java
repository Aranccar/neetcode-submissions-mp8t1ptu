class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1){
            return -1;
        }
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int[][] visit = new int[ROWS][COLS];
        Deque<int[]> queue = new ArrayDeque<>();

        queue.add(new int[2]); // Add {0, 0}
        visit[0][0] = 1;

        int length = 1;
        while (!queue.isEmpty()) {
            int queueLength = queue.size();
            for (int i = 0; i < queueLength; i++) {
                int pair[] = queue.poll();
                int r = pair[0], c = pair[1];
                
                if (r == ROWS - 1 && c == COLS - 1) {
                    return length;
                }    
                // We can directly build the four neighbors
                int[][] neighbors = {{r, c + 1}, {r + 1, c}, {r, c-1}, {r-1, c},
                              {r+1, c+1}, {r-1, c-1}, {r+1, c-1}, {r-1, c+1}};
                for (int j = 0; j < neighbors.length; j++) {
                    int newR = neighbors[j][0], newC = neighbors[j][1];
                    if (Math.min(newR, newC) < 0 || newR == ROWS || newC == COLS
                    ||  grid[newR][newC] == 1) {
                        continue;
                    }
                    queue.add(neighbors[j]);
                    grid[newR][newC] = 1;
                }
            }
            length++;
        }
        return -1; // This should never be called
    }
}