public class Solution {
    public String decodeString(String s) {
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        StringBuilder cur = new StringBuilder();
        StringBuilder curCount = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                curCount.append(c);
            } else if (c == '[') {
                stringStack.push(cur.toString());
                countStack.push(Integer.parseInt(curCount.toString()));
                cur = new StringBuilder();
                curCount = new StringBuilder();
                
            } else if (c == ']') {
                String temp = cur.toString();
                cur = new StringBuilder(stringStack.pop());
                int count = countStack.pop();
                for (int i = 0; i < count; i++) {
                    cur.append(temp);
                }
            } else {
                cur.append(c);
            }
        }

        return cur.toString();
    }
}