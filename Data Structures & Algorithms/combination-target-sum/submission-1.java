class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        dfs(nums, target, new ArrayList<>(), 0);
        return res;
    }

    void dfs(int[] nums, int target, List<Integer> cur, int i){
        if(i >= nums.length || target < 0){
            return;
        }
        if(target == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
        
        int curSum = target - nums[i];
        cur.add(nums[i]);
        dfs(nums, curSum, cur, i++);
        cur.remove(cur.size() - 1);
        dfs(nums, target, cur, i);
    }
}
