// Ques lInk :- https://leetcode.com/problems/boats-to-save-people/submissions/
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int min_num = 0;
        int i = 0;
        int j = people.length-1;
        while(i<=j){
            int sum = people[i] + people[j];
            if(sum<=limit){
                min_num++;
                i++;
                j--;
            }
            else{
                min_num++;
                j--;
            }
        }
        return min_num;
    }
}
