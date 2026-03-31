class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        res[0] = 1;
        int pre = 1;
        for(int i = 1; i < len; i++){
            res[i] = nums[i - 1] * pre;
            pre *= nums[i - 1]; 
        }

        int post = 1;
        for(int j = len - 1; j >= 0; j--){
            res[j] = res[j] * post;
            post *= nums[j];
        }

        return res;
    }
}  
