class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        dfs(nums, target, 0, new ArrayList<>());
        return res;
    }

    void dfs(int[] nums, int target, int i, List<Integer> cur){
        if(target == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(i >= nums.length || target < 0){
            return;
        }

        cur.add(nums[i]);
        dfs(nums, target - nums[i], i, cur);
        cur.remove(cur.size() - 1);
        dfs(nums, target, i+1, cur);
    }
}
