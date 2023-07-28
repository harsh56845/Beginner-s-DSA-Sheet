// QL:- https://leetcode.com/problems/reverse-vowels-of-a-string/submissions/
class Solution {
    public String reverseVowels(String s) {
        char[] sChar = s.toCharArray(); // tc -> O(N) , SC -> O(N)
        int start = 0;
        int end = sChar.length-1;
        String vow = "aeiouAEIOU";
        while(start<end){
            // strting vowel find
            while(start<end && !(vow).contains(sChar[start]+"")) start++;
            // ending vowel find
            while(start<end && !(vow).contains(sChar[end]+"")) end--;
            // swap
            char temp = sChar[start];
            sChar[start] = sChar[end];
            sChar[end] = temp;
            // move ahed
            start++;
            end--;
        }
        return String.valueOf(sChar);
    }
}
