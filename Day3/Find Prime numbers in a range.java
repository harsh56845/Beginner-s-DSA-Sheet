// Ques Link :- https://practice.geeksforgeeks.org/problems/find-prime-numbers-in-a-range4718/1
// Native/Normal
class Solution { 
    boolean isPrime(int n) {
        // for 1
        if(n==1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=M;i<=N;i++){
            if(isPrime(i)==true){
                ans.add(i);
            }
        }
        return ans;
    }
}

// super Optimised approch //  sieve of eratosthenes
TRY YOURSLEF 1st
