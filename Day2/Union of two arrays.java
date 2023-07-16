// Ques Link :- https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        boolean[] hashArray = new boolean[100001];
        
        for(int i : a)
        hashArray[i]= true;
        
        for(int i : b) / 1 2 3
        hashArray[i]= true;
        
        int ans = 0;
        
        for(int i=0;i<100001;i++){
            if(hashArray[i]){
                ans++;
            }
        }
        return ans;
    }
}
