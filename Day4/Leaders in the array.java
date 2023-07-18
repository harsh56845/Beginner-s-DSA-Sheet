// Q Lnk :- https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> sol = new ArrayList<>();
        sol.add(arr[n-1]);
        int max = arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                sol.add(arr[i]);
                max = arr[i];
            }
        }
        // reverse array list
        for (int i = 0; i < sol.size() / 2; i++) {
            Integer temp = sol.get(i);
            sol.set(i, sol.get(sol.size() - i - 1));
            sol.set(sol.size() - i - 1, temp);
        }
        
        return sol;
    }
}
