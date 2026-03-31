class Solution {
    public int climbStairs(int n) {
        int[] arr = {1, 1};
        int l = 0;
        int r = 1;
        int ind = 2;
        while(ind < n + 1){
            int tmp = arr[r];
            arr[r] = arr[r] + arr[l];
            arr[l] = tmp;
            ind++;
        }
        return arr[r];
    }

    
}
