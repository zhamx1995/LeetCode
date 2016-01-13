public class Solution {
    public String numberToWords(int num) {
        if(num == 0){
            return "Zero";
        }
        int digit = num%1000;
        num /= 1000;
        int thousand = 0;
        if(num != 0){
            thousand = num%1000;
            num /= 1000;
        }
        int million = 0;
        if(num != 0){
            million = num%1000;
            num /= 1000;
        }
        int billion = 0;
        if(num != 0){
            billion = num%1000;
        }
        String result = "";
        if(billion != 0){
            result += spellOut(billion) + "Billion ";
        }
        if(million != 0){
            result += spellOut(million) + "Million ";
        }
        if(thousand != 0){
            result += spellOut(thousand) + "Thousand ";
        }
        result += spellOut(digit);
        result = result.substring(0,result.length()-1);
        return result;
    }
    
    public String spellOut(int input){
        int hundred = input/100;
        input = input%100;
        int ten = input/10;
        input = input%10;
        int deci = input;
        String result = "";
        if(hundred == 1){result += "One Hundred ";}
        else if(hundred == 2){result += "Two Hundred ";}
        else if(hundred == 3){result += "Three Hundred ";}
        else if(hundred == 4){result += "Four Hundred ";}
        else if(hundred == 5){result += "Five Hundred ";}
        else if(hundred == 6){result += "Six Hundred ";}
        else if(hundred == 7){result += "Seven Hundred ";}
        else if(hundred == 8){result += "Eight Hundred ";}
        else if(hundred == 9){result += "Nine Hundred ";}
        
        boolean tenth = false;
        if(ten == 1){
            tenth = true;
            }
        else if(ten == 2){result += "Twenty ";}
        else if(ten == 3){result += "Thirty ";}
        else if(ten == 4){result += "Forty ";}
        else if(ten == 5){result += "Fifty ";}
        else if(ten == 6){result += "Sixty ";}
        else if(ten == 7){result += "Seventy ";}
        else if(ten == 8){result += "Eighty ";}
        else if(ten == 9){result += "Ninety ";} 
        
        if(!tenth){
        if(deci == 1){result += "One ";}
        else if(deci == 2){result += "Two ";}
        else if(deci == 3){result += "Three ";}
        else if(deci == 4){result += "Four ";}
        else if(deci == 5){result += "Five ";}
        else if(deci == 6){result += "Six ";}
        else if(deci == 7){result += "Seven ";}
        else if(deci == 8){result += "Eight ";}
        else if(deci == 9){result += "Nine ";}
        }
        
        else if(tenth){
        if(deci == 0){result += "Ten ";}
        else if(deci == 1){result += "Eleven ";}
        else if(deci == 2){result += "Twelve ";}
        else if(deci == 3){result += "Thirteen ";}
        else if(deci == 4){result += "Fourteen ";}
        else if(deci == 5){result += "Fifteen ";}
        else if(deci == 6){result += "Sixteen ";}
        else if(deci == 7){result += "Seventeen ";}
        else if(deci == 8){result += "Eighteen ";}
        else if(deci == 9){result += "Nineteen ";}
        }
        
        return result;
    }
}