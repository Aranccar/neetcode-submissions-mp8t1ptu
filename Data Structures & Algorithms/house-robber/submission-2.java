class Solution {
    public int rob(int[] nums) {
        int numlen = nums.length;
        int[] cache = new int[numlen];
        for(int i = 0; i < numlen; i++){
            cache[i] = -1;
        }
        return dfs(nums, cache, 0);
    }

    int dfs(int[] nums, int[] cache, int i){
        if(i >= nums.length){
            return 0;
        }

        if(cache[i] != -1){
            return cache[i];
        }

        cache[i] = Math.max(dfs(nums, cache, i + 1), nums[i] + dfs(nums, cache, i + 2));
        return cache[i];
    }
}
