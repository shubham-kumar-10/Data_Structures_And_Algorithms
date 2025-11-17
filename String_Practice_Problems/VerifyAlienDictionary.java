class VerifyAlienDictionary{
    public boolean isAlienSorted(String[] words, String order) {
        // Two pointer technique can be easily used to solve the problem.

        for(int i=0;i<words.length-1;i++) {
           if(!isLexicoGraphical(words[i],words[i+1],order))
             return false;
        }
        return true;
    }

    public boolean isLexicoGraphical(String word1,String word2,String order){
        int min=Math.min(word1.length(),word2.length());
        int i=0;
        while(i<min) {
            if(order.indexOf(word1.charAt(i))>order.indexOf(word2.charAt(i)))
               return false;
            else if(order.indexOf(word1.charAt(i))<order.indexOf(word2.charAt(i)))
              return true;
            else
            i++;   
        }
       // Now outside the loop , we only need to check if the length of first word is less than second or not.

       if(word1.length()>word2.length())
         return false;
       return true;
    }
} 