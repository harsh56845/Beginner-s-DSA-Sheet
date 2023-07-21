// Ques Line :- https://leetcode.com/problems/search-insert-position/description/
// Tc -> O(logN)  & SC -> O(1) 
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            // case 1 if we got same elemt so target must be inserted that positon
            if(nums[mid]==target) 
                return mid;
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }
}
