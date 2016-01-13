public class Solution {
    public void gameOfLife(int[][] board) {
        
        int[][] update = new int[board.length][board[0].length];
        ArrayList<int[]> live = new ArrayList<>();
        ArrayList<int[]> dead = new ArrayList<>();
        
    for(int row = 0; row<board.length; row++){
        for(int col = 0; col<board[0].length; col++){
            int lives = aliveNeighbour(row, col, board);
            if(lives < 2){ //under-population
                // update[row][col] = 0;
                int[] loc = {row, col};
                dead.add(loc);
            }
            else if(lives == 3 && board[row][col] == 0){ //reproduction
                // update[row][col] = 1;
                int[] loc = {row, col};
                live.add(loc);
            }
            else if(lives > 3 && board[row][col] == 1){ //over-population
                // update[row][col] = 0;
                int[] loc = {row, col};
                dead.add(loc);
            }
            else if((lives == 2 || lives == 3) && board[row][col] == 1){//continue
                // update[row][col] = 1;
                int[] loc = {row, col};
                live.add(loc);
            }
            else{
                // update[row][col] = 0;
                int[] loc = {row, col};
                dead.add(loc);
            }
        }
    }
    
    // board = update;
    for(int[] loc: live){
        board[loc[0]][loc[1]] = 1;
    }
    for(int[] loc:dead){
        board[loc[0]][loc[1]] = 0;
    }
    }
    
    public int aliveNeighbour(int row, int col, int[][] board){
        int result = 0;
        if(row-1 >= 0){
            result += board[row-1][col];
            if(col-1 >= 0){
                result += board[row-1][col-1];
            }
            if(col+1 < board[0].length){
                result += board[row-1][col+1];
            }
        }
        
        if(row+1 < board.length){
            result += board[row+1][col];
            if(col-1 >= 0){
                result += board[row+1][col-1];
            }
            if(col+1 < board[0].length){
                result += board[row+1][col+1];
            }
        }
        
        if(col-1 >= 0){
            result += board[row][col-1];
        }
        
        if(col+1 < board[0].length){
            result += board[row][col+1];
        }
        return result;
    }
}