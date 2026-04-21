class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
         while (l < r) {
            if (!alphaNum(s.charAt(l))) {
                l++;
                continue;
            }
             if (!alphaNum(s.charAt(r))) {
                r--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++; r--;
         }
         return true;
    }
    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
