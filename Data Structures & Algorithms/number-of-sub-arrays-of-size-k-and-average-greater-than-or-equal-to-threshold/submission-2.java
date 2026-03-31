class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int L = 0;
        int sum = 0;
        int res = 0;

        for(int i = 0; i < k - 1; i++){
            sum += arr[i];
        }

        for(int r = k - 1; r < arr.length; r++){
            sum += arr[r];
            if((sum/k) >= threshold){
                res++;
            }
            sum -= arr[L++];
            
        }

        return res;
    }
}