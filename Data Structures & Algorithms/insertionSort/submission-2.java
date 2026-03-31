// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> res = new ArrayList<>();
        for(int r = 0; r < pairs.size(); r++){
            
            int j = r;
            while(j > 0){
                if(pairs.get(j).key < pairs.get(j - 1).key){
                    Pair tmp = pairs.get(j);
                    pairs.set(j, pairs.get(j - 1));
                    pairs.set(j - 1, tmp);
                }
                j--;
            }
            res.add(new ArrayList<>(pairs));
        }
        

        return res;
    }
}
