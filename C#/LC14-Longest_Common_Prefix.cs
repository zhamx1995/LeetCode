public class Solution {
    public string LongestCommonPrefix(string[] strs) {
        string result = "";
        int index = 0;
        if(strs.Length == 0){
            return result;
        }
        while(index < strs[0].Length){
            string target = strs[0].Substring(index, 1);
            foreach(string cur in strs){
               if(cur.Length < index+1){
                   return result;
               }
               if(cur.Substring(index, 1) != target){
                  return result;
               }
            }
            result += target;
            index++;
        }
        return result;
    }
}