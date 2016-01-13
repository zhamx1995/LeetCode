public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0){
            return list;
        }
        else if(numRows == 1){
            List<Integer> add = new ArrayList<>();
            add.add(1);
            list.add(add);
            return list;
        }
        
        List<Integer> add = new ArrayList<>();
        add.add(1);
        list.add(add);
        
        for(int i = 1;i<numRows; i++){
            List<Integer> thislayer = new ArrayList<>();
            for(int j = 0;j<=i;j++){
            if(j == 0){
                thislayer.add(1);
            }
            else if(j==i){
                thislayer.add(1);
            }
            else{
                thislayer.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            }
            list.add(thislayer);
        }
        return list;
        
    }
}