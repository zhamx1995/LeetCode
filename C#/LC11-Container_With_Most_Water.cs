public class Solution {
    public int MaxArea(int[] height) {
        int max = 0;
        for(int i = 0; i<height.Length; i++){
            for(int j = height.Length-1; j>i; j--){
                if(height[i]*(j-i) < max){
                    break;
                }
                else{
                int cur = Math.Min(height[i],height[j])*(j-i);
                if(cur > max){
                    max = cur;
                }
                }
            }
        }
        return max;
    }
}