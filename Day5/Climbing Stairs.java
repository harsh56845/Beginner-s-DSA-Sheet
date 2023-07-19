// Ques Link :- https://leetcode.com/problems/climbing-stairs/description/
class Solution {
    int[] dp = new int[46];
    public int climbStairs(int n) {
        // if we reach on top
        if(n==0) return 1;

        // if we go beyond our starcase
        if(n<0) return 0;

        if(dp[n]!=0) return dp[n];
        return dp[n] = climbStairs(n-1) + climbStairs(n-2);
    }
}
