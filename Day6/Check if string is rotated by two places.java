// Ques Link :- https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1?page=3&difficulty[]=0&sortBy=submissions
// TC-> O(N)  , SC-> O(1)
class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        int n = str1.length();
        int m = str2.length();
        if (n != m) //check both the string length equal or not
            return false;
        boolean clockwise = true;
        boolean anticlockwise = true;
      //check clockwise rotation is possible or not
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i)!= str2.charAt((i + 2) % n)) {
                clockwise = false;
                break;
            }
        }
      // check anticlockwise rotation is possible or not
        for (int i = 0; i < m; i++) {
            if (str1.charAt((i + 2) % n)!= str2.charAt(i)) {
                anticlockwise = false;
                break;
            }
        }
        return (clockwise || anticlockwise);
    }
}
