class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        dfs(candidates, 0, target, new ArrayList<>(), 0);
        return res;
    }

    public void dfs(int[] nums, int i, int target, List<Integer> cur, int total){
        if(total == target){
            res.add(new ArrayList<>(cur));
            return;
        }
        
        if(i >= nums.length || target < total){
            return;
        }

        

        cur.add(nums[i]);

        dfs(nums, i + 1, target, cur, total + nums[i]);

        while(i < nums.length - 1 && nums[i] == nums[i + 1]){
            i++;
        }

        cur.remove(cur.size() - 1);
       
        dfs(nums, i + 1, target, cur, total);
    }
}
