public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.equals("") && t.equals("")){
            return true;
        }
        String[] sa = s.split("");
        String[] ta = t.split("");
        Arrays.sort(sa);
        Arrays.sort(ta);
        if(sa.length != ta.length){
            return false;
        }
        for(int i = 0; i<sa.length; i++){
        if(!sa[i].equals(ta[i])){
            return false;
        }
        }
            return true;
    }
}