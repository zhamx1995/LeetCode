public class Solution {
    public int removeElement(int[] nums, int val) {
        int end = nums.length-1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == val){
                while(nums[end] == val){
                    end--;
                    if(end < 0){
                        break;
                    }
                }
                if(i >= end){
                 break;   
                }
                else{
                    nums[i] = nums[end];
                    nums[end] = val;
                }
            }
        }
        return end+1;
    }
}