// Ques Link :- https://leetcode.com/problems/sqrtx/description/
// Native Approch TC -> O(N)
class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int n = x;
        int ans = 0;
        for(int i=1;i<=n/i;i++){
            if(i<=n/i){
                ans = i;
            }
        }
        return ans;
    }
}

// Binary Search Approch Tc -> O(longN)
class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int start = 1;
        int end = x;
        int ans = 0;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid<x/mid){
                ans = mid;
                start = mid+1;
            }
            else if(mid>x/mid){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return ans;
    }
}
