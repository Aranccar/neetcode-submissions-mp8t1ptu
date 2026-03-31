class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[left] != nums[right]){
                left++;
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
            right++;
        }
        return left + 1;
    }
}