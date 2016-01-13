public class Solution {
    public int RomanToInt(string s) {
        int num = 0;
        while(s.StartsWith("M")){
            s = s.Remove(0,1);
            num += 1000;
        }
        if(s.StartsWith("CM")){
            s = s.Remove(0,2);
            num += 900;
        }
        if(s.StartsWith("D")){
            s = s.Remove(0,1);
            num += 500; 
        }
        if(s.StartsWith("CD")){
            s = s.Remove(0,2);
            num += 400; 
        }
        while(s.StartsWith("C")){
            s = s.Remove(0,1);
            num += 100;
        }
        if(s.StartsWith("XC")){
            s = s.Remove(0,2);
            num += 90;
        }
        if(s.StartsWith("L")){
            s = s.Remove(0,1);
            num += 50; 
        }
        if(s.StartsWith("XL")){
            s = s.Remove(0,2);
            num += 40; 
        }
        while(s.StartsWith("X")){
            s = s.Remove(0,1);
            num += 10;
        }
        if(s.StartsWith("IX")){
            s = s.Remove(0,2);
            num += 9;
        }
        if(s.StartsWith("V")){
            s = s.Remove(0,1);
            num += 5; 
        }
        if(s.StartsWith("IV")){
            s = s.Remove(0,2);
            num += 4; 
        }
        while(s.StartsWith("I")){
            s = s.Remove(0,1);
            num += 1;
        }
        return num;   
    }
}