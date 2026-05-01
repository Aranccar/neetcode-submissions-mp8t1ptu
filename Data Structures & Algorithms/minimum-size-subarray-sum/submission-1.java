class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int L = 0;
        int sum = 0;
        

        for(int r = 0; r < nums.length; r++){
            sum += nums[r];
            while(sum >= target){
                min = Math.min(min, r - L + 1);
                sum -= nums[L];
                L++;
            }
        }

        if (min ==  Integer.MAX_VALUE) {
            return 0;
        } 

        return min;
    }
}