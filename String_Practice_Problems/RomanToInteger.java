import java.util.HashMap;

class RomanToInteger{
    public int romanToInt(String s) {
        int result=0;
        if(s.length()==0)
            return result; // adding this condition to handle empty string case
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        if(s.length()==0)
          return 0;  // 

        if(s.length()==1)
         return map.get(s.charAt(0)); // base case handled
        // Iterating through the string and checking the value of current character with next character
        // If current character is less than next character, we subtract the value of current character from result
        // Otherwise, we add the value of current character to result
        for(int i=0;i<s.length()-1;i++) {
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1)))
              result-=map.get(s.charAt(i));
            else
              result+=map.get(s.charAt(i));
        } 
        result+=map.get(s.charAt(s.length()-1)); // adding last character value to the result
        return result;
    }

// How to write test cases for this code?
  public static void main(String args[]){
    RomanToInteger obj=new RomanToInteger();    
    System.out.println(obj.romanToInt("III")); // Output: 3
    System.out.println(obj.romanToInt("IV")); // Output: 4  
    System.out.println(obj.romanToInt("IX")); // Output: 9
    System.out.println(obj.romanToInt("LVIII")); // Output: 58
    System.out.println(obj.romanToInt("MCMXCIV")); 
  }
}