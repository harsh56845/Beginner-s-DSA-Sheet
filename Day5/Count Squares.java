// Ques Link :- https://practice.geeksforgeeks.org/problems/count-squares3649/1
// TC-> O(1) constant time , SC -> O(1) constant space
class Solution {
    static int countSquares(int N) {
        return (int)Math.sqrt(N-1);
    }
}
