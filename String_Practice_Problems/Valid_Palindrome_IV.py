#You are given a string s consisting of only lowercase English letters, indexed starting from 0. You can perform operations on this string where each operation allows you to change any character to any other character.
# The task is to determine if you can transform the string s into a palindrome by performing exactly one or two operations. A palindrome is a string that reads the same forwards and backwards.
# You need to return true if it's possible to make s a palindrome with exactly 1 or 2 character changes, and false otherwise.

def check_valid_palindrome(s:str)->bool:
    left=0
    right=len(s)-1

    count_mismatch=0
    while left<right:
        if s[left]!=s[right]:
            count_mismatch+=1
        left+=1
        right-=1

    return False if count_mismatch>2 else True

if __name__=="__main__":
    s1="abca"
    print(check_valid_palindrome(s1))  #Output: True

    s2="abc"
    print(check_valid_palindrome(s2))  #Output: True   

    print(check_valid_palindrome("abcdef"))  # Output: False


