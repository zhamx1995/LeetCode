public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] patpro = pattern.split("");
        String[] strpro = str.split(" ");
        int[] patA = toForm(patpro);
        int[] strA = toForm(strpro);
        if(patA.length != strA.length || pattern.equals("")){
            return false;
        }
        for(int i=0; i< patA.length; i++){
            if(patA[i]!=strA[i]){
                return false;
            }
        }
        return true;
    }
    public int[] toForm(String[] input){
        HashMap<String, Integer> map = new HashMap<>();
        int[] result = new int[input.length];
        int index = 0;
        for(int i = 0;i<input.length;i++){
            String cur = input[i];
            if(map.keySet().contains(cur)){
                result[i] = map.get(cur);
            }
            else{
                map.put(cur,index);
                result[i] = index;
                index++;
            }
        }
        return result;
    }
}