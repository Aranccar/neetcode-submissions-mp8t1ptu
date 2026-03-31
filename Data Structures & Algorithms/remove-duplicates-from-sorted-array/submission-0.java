class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int tmp = 0;

        while(i < nums.length){
            if(nums[tmp] != nums[i]){
                nums[++tmp] = nums[i];
            }
            i++;
        }

        return tmp + 1;
    }
}