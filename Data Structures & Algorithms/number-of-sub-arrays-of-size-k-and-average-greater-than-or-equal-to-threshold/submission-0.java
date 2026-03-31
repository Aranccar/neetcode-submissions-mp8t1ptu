class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int L = 0;
        int sum = 0;
        int res = 0;

        for(int r = 0; r < arr.length; r++){
            sum += arr[r];
            if(r - L + 1 >= k){
                if((sum/k) >= threshold){
                    res++;
                }
                sum -= arr[L];
                L++;
            }
            
        }

        return res;
    }
}