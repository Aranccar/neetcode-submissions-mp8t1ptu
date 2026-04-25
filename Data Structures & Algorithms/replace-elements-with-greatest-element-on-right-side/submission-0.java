class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];
        int[] res = new int[arr.length];
        res[arr.length - 1] = -1;
        for(int i = arr.length - 2; i >= 0; i--){
            res[i] = max;
            max = Math.max(arr[i], max);
        }

        return res;
    }
}