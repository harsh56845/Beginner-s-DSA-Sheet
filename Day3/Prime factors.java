// Que Link :- https://practice.geeksforgeeks.org/problems/prime-factors5052/1
class Solution
{
    public int[] AllPrimeFactors(int N) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=2;i<=N;i++){
            
            if(N%i==0){ 
                ans.add(i);
                while(N%i==0){
                    N=N/i;
                }
            }
            if(N==1) break;
        }
        
        int[] arr = new int[ans.size()];
        for(int i=0;i<ans.size();i++)
            arr[i] = ans.get(i);
            
        return arr;
    }
}
