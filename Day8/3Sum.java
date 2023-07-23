// ques link :-https://leetcode.com/problems/3sum/description/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            // i duplicate
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> subSol = new ArrayList<>();
                    subSol.add(nums[i]);
                    subSol.add(nums[j]);
                    subSol.add(nums[k]);
                    res.add(subSol);
                    j++;
                    k--;
                    // j duplicate
                    while(j<k && nums[j]==nums[j-1]) j++; 
                    // k duplicate
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
                else if(sum>0){
                    k--;
                }
                // sum<0
                else{
                    j++;
                }
            }
        }
        return res;
    }
}
