class Solution {
    public int climbStairs(int n) {
        if(n <= 0){
           return n == 0 ? 1 : 0;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
