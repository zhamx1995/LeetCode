public class Solution {
    public void moveZeroes(int[] nums) {
    int shift = 0;
    for(int i = 0; i< nums.length; i++){
        if(nums[i]==0){
            shift++;
        }
        else{
            nums[i-shift] = nums[i];
        }
    }
    for(int j = nums.length - shift;j<nums.length;j++){
            nums[j] = 0;
        }
    }
}