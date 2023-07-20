// Ques Link :- https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1
class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        int[] frqArray = new int[26];
        
        for(char ch:S.toCharArray()){
            frqArray[ch-'a']++;
        }
        
        for(char ch:S.toCharArray()){
            if(frqArray[ch-'a']==1) return ch;
        }
        
        return '$';
    }
    
}
