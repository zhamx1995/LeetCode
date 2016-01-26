public class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        if(amount == 0) return 0;
        if(amount<coins[0]) return -1;
        
        int[] optimal = new int[amount-coins[0]+1];
        optimal[0] = 1;
        for(int i=1; i<optimal.length; i++){
            int cur = Integer.MAX_VALUE;
            boolean check = true;
            for(int one: coins){
                if(i+coins[0] == one){
                    optimal[i] = 1;
                    check = false;
                    break;
                }
                int position = i-one;
                if(position>=0){
                    if(optimal[position] < cur && optimal[position]!= 0){
                        cur = optimal[position];
                    }
                }
            }
            if(cur != 0 && cur != Integer.MAX_VALUE && check){
                optimal[i] = cur+1;
            }
        }
        if(optimal[optimal.length-1] == 0){
            return -1;
        }
        else{
            return optimal[optimal.length-1];
        }
        
    }
}