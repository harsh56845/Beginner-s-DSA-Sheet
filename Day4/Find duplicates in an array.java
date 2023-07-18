// Ques Link :- https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&sortBy=submissions
class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> sol = new ArrayList<>();
        int[] hashArray = new int[100001];
        for(int i:arr) hashArray[i]++;
        for(int i=0;i<hashArray.length;i++) {
            if(hashArray[i]>1) 
            sol.add(i);
        }
        if(sol.size()==0) sol.add(-1);
        return sol;
    }
}
