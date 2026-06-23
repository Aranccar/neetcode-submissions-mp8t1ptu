public class Solution {

    private List<String> res = new ArrayList<>();
    private String[] digitToChar = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "qprs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return res;
        StringBuilder cur = new StringBuilder();
        backtrack(0, cur, digits);
        return res;
    }

    private void backtrack(int i, StringBuilder curStr, String digits) {
        if (curStr.length() == digits.length()) {
            res.add(curStr.toString());
            return;
        }
        String chars = digitToChar[digits.charAt(i) - '0'];
        for (char c : chars.toCharArray()) {
            backtrack(i + 1, curStr.append(c), digits);
            curStr.deleteCharAt(curStr.length() - 1);
        }
    }
}