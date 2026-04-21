class Solution {
    public void rotate(int[][] matrix) {
        reverse(matrix);

        for(int r = 0; r < matrix.length; r++){
            for(int c = r; c < matrix[r].length; c++){
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
    }

    private void reverse(int[][] matrix) {
        int n = matrix.length;
        for(int r = 0; r < n/2; r++){
            int[] temp = matrix[r];
            matrix[r] = matrix[n - 1 - r];
            matrix[n - 1 - r] = temp;
        }
    }
}
