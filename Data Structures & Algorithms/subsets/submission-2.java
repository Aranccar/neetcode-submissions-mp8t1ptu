class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        for(int num : nums){
            int len = subsets.size();
            for(int i = 0; i < len; i++){
                List<Integer> subset = new ArrayList<>(subsets.get(i));
                subset.add(num);
                subsets.add(subset);
            }
        }
        return subsets;
    }

}
