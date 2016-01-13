public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if(nums.length > 100){
        for(int i = 0; i<nums.length; i++){
            int cur = nums[i];
                for(int j = cur-t; j <= cur+t; j++){
                    if(map.keySet().contains(j) && i-map.get(j) <= k){
                      return true; 
                    }
                }
                
                map.put(cur, i);
        }
        return false;
        }
        
        else{
        for(int i = 0; i<nums.length; i++){
            int cur = nums[i];
            for(int x: map.keySet()){
               if(Math.abs((long)cur-(long)x) <= t && i-map.get(x) <= k){
                     return true; 
                }
            }
                map.put(cur, i);
        }
        return false;
        }
        
    }
}