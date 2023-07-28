// QL :- https://leetcode.com/problems/repeated-substring-pattern/
class Solution {
    // SC -> O(N)  , TC -> O(N) 
    public boolean repeatedSubstringPattern(String s) {
        String res = s+s; 
        String temp = res.substring(1,res.length()-1);
        return temp.contains(s);
    }
}
