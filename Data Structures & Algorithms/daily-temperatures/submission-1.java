class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for(int i = 0; i < temperatures.length; i++){
            int t = temperatures[i];
            while(!stack.isEmpty() && stack.peek()[0] < t){
                int[] temp = stack.pop();
                res[temp[1]] = i - temp[1];
            }

            stack.push(new int[]{t, i});
        }

        return res;

    }
}
