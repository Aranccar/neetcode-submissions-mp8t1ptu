class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int num = 1; num <= n; num++){
            int tmp = num;
            while(tmp > 0){
                if((tmp & 1) == 1){
                    res[num]++;
                }
                tmp = tmp>>1;
            }
        }

        return res;
    }
}
