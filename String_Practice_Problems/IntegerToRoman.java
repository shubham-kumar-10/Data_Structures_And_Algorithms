class IntegerToRoman {
    public String intToRoman(int num) {    
              if(num==0)
              return "";
              
              int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
              String[] symbols = {
                        "M", "CM", "D", "CD", "C", "XC", "L", "XL",
                        "X", "IX", "V", "IV", "I"
                    };
              int i=0;
              StringBuilder sb=new StringBuilder();
              while(num>0) {
                if(num>=values[i]){
                    num-=values[i];
                    sb.append(symbols[i]);
                }
                else
                   i+=1;
              }
              return sb.toString(); 
    }
}

// TC:O(N)
// SC:O(constant space)