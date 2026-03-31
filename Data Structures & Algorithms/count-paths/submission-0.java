class Solution {
    public int uniquePaths(int m, int n) {
        int[] prevcols = new int[n];
        for(int i = m - 1; i >= 0; i--){
            int[] currow = new int[n];
            currow[n - 1] = 1;
            for(int j = n - 2; j >= 0; j--){
                currow[j] = currow[j + 1] + prevcols[j];
            }
            prevcols = currow;
        }
        return prevcols[0];
    }
}
