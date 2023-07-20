// Ques link :- https://practice.geeksforgeeks.org/problems/index-of-an-extra-element/1?page=5&difficulty[]=0&sortBy=submissions
class Solution {
    public int findExtra(int a[], int b[], int n) {
        // add code here.
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = (start+end)/2;
  
            if(mid==n-1) 
                return n-1;
            
            if(a[mid]==b[mid]){
                start = mid+1;
            }
            else{
                index = mid;
                end = mid-1;
            }
        }
        
        return index;
    }
}
