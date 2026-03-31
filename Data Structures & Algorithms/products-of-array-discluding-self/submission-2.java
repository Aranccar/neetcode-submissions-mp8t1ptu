class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int preSum = 1;
        for(int i = 1; i < len; i++){
            res[i] = preSum * nums[i - 1];
            preSum *= nums[i - 1];
        }
        int postSum = 1;
        res[0] = 1;
        for(int j = len - 1; j >= 0; j--){
            res[j] = postSum * res[j];
            postSum *= nums[j];
        }
        return res;
    }
}  
