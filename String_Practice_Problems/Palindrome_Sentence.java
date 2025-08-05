class Solution {
    public boolean isPalindromeSentence(String s) {
        
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()) {
            if(Character.isLetterOrDigit(c))
              sb.append(c);
        }
        String finalStr=sb.toString();
        finalStr=finalStr.toLowerCase();
        int start=0;
        int end=finalStr.length()-1;
        while(start<=end) {
            char c1=finalStr.charAt(start);
            char c2=finalStr.charAt(end);
            if(!Character.isLetterOrDigit(c1))
             start+=1;
            if(!Character.isLetterOrDigit(c2))
             end-=1;
            if(c1==c2)
             {
                 start++;
                 end--;
             }
             else
              return false;
        }
        return true;
    }
}

// Time complexity: O(length of string)
// Space Complexity: O(length of string)

/* Sample test cases: 
1) word="Abc 012..## 10cbA"   Output: true
2)word="ABa"   Output: true
3) word="cba" Output: false
*/
