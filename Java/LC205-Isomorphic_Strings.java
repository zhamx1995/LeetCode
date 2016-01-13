public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<String, String> smap = strToMap(s);
        HashMap<String, String> tmap = strToMap(t);
        if(smap.keySet().size() != tmap.keySet().size()){
            return false;
        }
        int ori = smap.keySet().size();
        int result = 0;
        //HashSet<String> usedsets = new HashSet<>();
        HashSet<String> usedsett = new HashSet<>();
        for(String entry: smap.keySet()){
            String val = smap.get(entry);
            for(String tele: tmap.keySet()){
                
                if(val.equals(tmap.get(tele)) && !usedsett.contains(tele)){
                    result++;
                    usedsett.add(tele);
                    break;
                }
            }
        }
        if(result == ori){
            return true;
        }
        else{
            return false;
        }
    }
    
    public HashMap<String, String> strToMap (String input){
        String[] ina = input.split("");
        HashMap<String, String> result = new HashMap<>();
        for(int i = 0; i<ina.length ;i++){
            if(result.keySet().contains(ina[i])){
                String old = result.get(ina[i]);
                String add = old + "+" + Integer.toString(i);
                result.put(ina[i],add);
            }
            else{
                String add = Integer.toString(i);
                result.put(ina[i], add);
            }
        }
        return result;
    }
}