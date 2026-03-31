class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[right] != val){
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
            }
            right++;
        }

        return left++;
    }
}