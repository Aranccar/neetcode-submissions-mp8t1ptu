class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(!stack.isEmpty() && map.containsKey(c)){
                if(stack.peek() != map.get(c)){
                   return false;
                }
                stack.pop();
            }else{
                stack.push(c);
            }
            
        }

        return stack.isEmpty();

    }
}
