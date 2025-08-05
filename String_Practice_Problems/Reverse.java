package Data_Structures_And_Algorithms.String_Practice_Problems;
class Reverse
{
    public static String reverse(String str) {
        if(str==null || str.length()<=1)
            return str;
        String reverseString="";
        for(int i=str.length()-1;i>=0;i--) {
            reverseString+=str.charAt(i);
        }
        return reverseString; 
    }  
    public static void main(String[] args){
       String word="ABC";
       String reversedWord=reverse(word);
       System.out.println("Reversed word for original string: "+ word + " is: " + reversedWord);

    }
}