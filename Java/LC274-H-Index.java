public class Solution {
    public int hIndex(int[] citations) {
        if(citations.length == 0){
            return 0;
        }
        Arrays.sort(citations);
        int result = 0;
        while(citations[citations.length-1-result] > result){
            result++ ;
            if(result == citations.length){
                return result;
            }
        }
        return result;
    }
}