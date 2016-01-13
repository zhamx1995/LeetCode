public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i<nums.length; i++){
        if(map.keySet().contains(nums[i])){
            int prev = map.get(nums[i]);
            if(i-prev <= k){
                return true;
            }
            map.put(nums[i],i);
        }
        else{
            map.put(nums[i],i);
        }
    }
    return false;
        
    }
}