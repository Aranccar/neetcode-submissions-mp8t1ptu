class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();
        int c = 0;
        int r = 0;

        for(char[] row : board){
            for(char col : row){
                if(col == '.'){
                    c++;
                    continue;
                }
                String squareKey = (r / 3) + "," + (c / 3);
                if(rows.computeIfAbsent(r, v -> new HashSet<>()).contains(col) || 
                    cols.computeIfAbsent(c, v -> new HashSet<>()).contains(col) ||
                    squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(col))
                {
                    return false;
                }
                
                    rows.get(r).add(col);
                    cols.get(c).add(col);
                    squares.get(squareKey).add(col);
                
                c++;
            }
            c = 0;
            r++;
        }

        return true;
    }
}
