class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int L = 0;
        int R = matrix.length - 1;
        int mid;

        while(L <= R){
            mid = (L + R) / 2;
            if(matrix[mid][0] > target){
                R = mid - 1;
            }else if(matrix[mid][matrix[mid].length - 1] < target){
                L = mid + 1;
            }else{
                int l = 0;
                int r = matrix[mid].length - 1;
                int m;
                while(l <= r){
                    m = (l + r)/2;
                    if(matrix[mid][m] > target){
                        r = m - 1;
                    }else if(matrix[mid][m] < target){
                        l = m + 1;
                    }else{
                        return true;
                    }
                }
                return false;
            }
        }

        return false;
    }
}
