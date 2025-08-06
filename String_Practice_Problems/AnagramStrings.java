package Data_Structures_And_Algorithms.String_Practice_Problems;
import java.util.*;
class AnagramStrings{
    public static boolean checkAnagramStrings(String str1,String str2){
       // Assuming that the str1 and str2 is having lowercase characters. If 
       int[] arr=new int[26];
       if(str1.length()!=str2.length())
            return false;
        if(str1=="" || str2=="")
            return false;
        for(int i=0;i<str1.length();i++) {
            arr[str1.charAt(i)-'a']++;
            arr[str2.charAt(i)-'a']--;
        }  
        
        for(int num:arr) {
            if(num!=0)
               return false;
        }
        return true;
    }
  public static void main(String args[]){
    String str1="anagram";
    String str2="nagaram";
    System.out.println(checkAnagramStrings(str1,str2)); // true
 
    /*Similarly , the code can be tested for other test cases as well. 
    str1="car"    str2="rat"    ---> Output: false*/
  }
}

// TC: O(N) // SC:O(1) as we are using only constant space 


    
