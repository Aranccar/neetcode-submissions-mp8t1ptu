// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        int s = 0;
        int e = pairs.size() - 1;
        sort(s, e, pairs);
        return pairs;

    }
    
    void sort(int s, int e, List<Pair> pairs){
        if(e - s  < 1){
            return;
        }
        Pair pivot = pairs.get(e);
        int left = s;
        for(int i = s; i < e; i++){
            if(pivot.key > pairs.get(i).key){
                Pair tmp = pairs.get(left);
                pairs.set(left, pairs.get(i));
                pairs.set(i , tmp);
                left++;
            }
        }

        pairs.set(e, pairs.get(left));
        pairs.set(left, pivot);

        sort(s, left - 1, pairs);
        sort(left + 1, e, pairs);
    }
}
