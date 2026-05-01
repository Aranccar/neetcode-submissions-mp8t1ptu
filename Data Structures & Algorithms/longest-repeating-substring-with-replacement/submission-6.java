class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int res = 0;
        int maxF = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(r < s.length()){
            char cur = s.charAt(r);
            map.put(cur, map.getOrDefault(cur, 0) + 1);
            maxF = Math.max(maxF, map.get(cur));
            while((r - l + 1) - maxF > k){
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
            r++;
        }
        return res;
    }
}
