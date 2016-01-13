public class Solution {
    public string Convert(string s, int numRows) {
        int dist = numRows*2 -2;
        char[] chars = s.ToCharArray();
        string[] lines = new string[numRows];
        for (int j = 0; j<numRows; j++){
            lines[j] = "";
        }
        int curL = 0;
        int incre = 1;
        for(int i = 0; i<s.Length; i++){
            lines[curL] += chars[i];
            curL += incre;
            if(curL == numRows){
                if(numRows == 1){
                    curL = 0;
                }
                else{
                    incre = -1;
                    curL = numRows-2;
                }
            }
            else if(curL == -1){
                incre = 1;
                curL = 1;
            }
            else{
                //nothing
            }
        }
        return String.Join("", lines);
    }
}