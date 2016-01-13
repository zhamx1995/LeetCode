public class Solution {
    public int Reverse(int x) {
        int result = 0;
        while(x != 0){
            if(result > 214748364.8 || result < -214748364.8){
                result = 0;
                break;
            }
            else{
                result = result*10 + (x%10);
                x /= 10;
            }
        }
        return result;
    }
}