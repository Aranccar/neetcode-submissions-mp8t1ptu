class Solution {
    public void sortColors(int[] nums) {
        int[] res = new int[3];

        for(int i = 0; i < nums.length; i++){
            res[nums[i]]++;
        }
        int ind = 0;
        for(int j = 0; j < res.length; j++){
            for(int k = 0; k < res[j]; k++){
                nums[ind++] = j;
            }
        }

        
    }
}