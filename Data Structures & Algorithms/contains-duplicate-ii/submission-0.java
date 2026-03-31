class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int L = 0;

        for(int r = 0; r < nums.length; r++){
            if(r - L > k){
                set.remove(nums[L]);
                L++;
            }
            if(set.contains(nums[r])){
                return true;
            }
            set.add(nums[r]);
        }

        return false;
    }
}