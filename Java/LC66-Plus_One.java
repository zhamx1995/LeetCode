public class Solution {
    public int[] plusOne(int[] digits) {
        int adder = 1;
        for(int i = digits.length-1;i>=0;i--){
            int x = digits[i] + adder;
            digits[i] = x%10;
            if(x>= 10){
                if(i == 0){
                    ArrayList<Integer> resize = new ArrayList<>();
                    resize.add(1);
                    for(int j = 0; j<digits.length; j++){
                        resize.add(digits[j]);
                    }
                    int[] result = new int[resize.size()];
                    for(int k = 0; k<result.length; k++){
                        result[k] = resize.get(k);
                    }
                    return result;
                }
                adder = 1;
            }
            else{
                adder = 0;
            }
        }
        return digits;
    }
}