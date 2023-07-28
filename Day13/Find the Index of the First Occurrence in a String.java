// QL :-https://leetcode.com/problems/reverse-vowels-of-a-string/description/
class Solution {
    // TC -> O(n) , SC -> O(n)
    public int strStr(String haystack, String needle) {
        String res = haystack.replaceFirst(needle,"#");

        // if(haystack.equals(res)) return -1;

        for(int i=0;i<res.length();i++){
            if(res.charAt(i)=='#'){
                return i;
            }
        }
        return -1;
    }
}
