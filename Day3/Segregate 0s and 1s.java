LInk :- https://practice.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
class Solution {
    void segregate0and1(int[] arr, int n) {
        int low = 0;
        int high = n-1;
        
        while(low<=high){
            if(arr[low]==0){
                low++;
            }
            else{
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

}
