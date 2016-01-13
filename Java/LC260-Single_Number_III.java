public class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
        int[] result = new int[2];
        int index = 0;
        for(int x: set){
            result[index] = x;
            index++;
        }
        return result;
    }
}