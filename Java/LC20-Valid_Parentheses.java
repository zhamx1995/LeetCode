public class Solution {
    public boolean isValid(String s) {
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> median = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();
        int is = 0;
        int im = 0;
        int il = 0;
        String[] sa = s.split("");
        for(int i = 0; i<sa.length; i++){
            String cur = sa[i];
            if(cur.equals("(")){
                small.add(i);
                is = i;
            }
            else if(cur.equals(")")){
                if(small.size() == 0){
                    return false;
                }
                if(is<im || is<il){
                    return false;
                }
                small.remove(small.size()-1);
                if(small.size() == 0){
                    is = 0;
                }
                else{
                is = small.get(small.size()-1);
                }
            }
            else if(cur.equals("[")){
                median.add(i);
                im = i;
            }
            else if(cur.equals("]")){
                if(median.size() == 0){
                    return false;
                }
                if(im<is || im<il){
                    return false;
                }
                median.remove(median.size()-1);
                if(median.size() == 0){
                    im = 0;
                }
                else{
                im = median.get(median.size()-1);
                }
            }
            else if(cur.equals("{")){
                large.add(i);
                il = i;
            }
            else{
                if(large.size() == 0){
                    return false;
                }
                if(il<im || il<is){
                    return false;
                }
                large.remove(large.size()-1);
                if(large.size() == 0){
                    il = 0;
                }
                else{
                il = large.get(large.size()-1);
                }
            }
        }
        int size = small.size() + median.size() + large.size();
        if(size == 0){
            return true;
        }
        return false;
    }
}