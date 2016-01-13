public class Solution {
    public int numSquares(int n) {
        int[] bestsol = new int[n+1];
        for(int i = 0; i<n+1; i++){
            if(i == 0){
                bestsol[i] = 0;
            }
            else if(i == 1){
                bestsol[i] = 1;
            }
            else{
                int largest = (int)Math.sqrt(i);
                int sol = Integer.MAX_VALUE;
                for(int j = 1; j<=largest;j++){
                    int cursol= bestsol[i-j*j]+1;
                    if(sol>cursol){
                        sol = cursol;
                    }
                }
                bestsol[i] = sol;
            }
        }
        return bestsol[n];
        
    }
}