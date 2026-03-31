class Solution {
    public int climbStairs(int n) {
        return dfs(n, new int[n + 1]);
    }

    int dfs(int n, int[] cache){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(cache[n] != 0){
            return cache[n];
        }

        cache[n] = dfs(n - 1, cache) + dfs(n - 2, cache);
        return cache[n];
    }
}
