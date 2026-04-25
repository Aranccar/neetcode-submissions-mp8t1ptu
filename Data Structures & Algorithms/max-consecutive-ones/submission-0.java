class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int cnt = 0;
        for(int n : nums){
            cnt++;
            if(n != 1){
                cnt = 0;
            }
            res = Math.max(res, cnt);

                
            
        }

        return res;
    }
}