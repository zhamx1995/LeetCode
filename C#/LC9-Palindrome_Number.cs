public class Solution {
    public bool IsPalindrome(int x) {
        string num = x.ToString();
        int head = 0;
        int end = num.Length-1;
        char[] chars = num.ToCharArray();
        while(head < end){
            if(chars[head] != chars[end]){
                return false;
            }
            else{
                head++;
                end--;
            }
        }
        return true;
    }
}