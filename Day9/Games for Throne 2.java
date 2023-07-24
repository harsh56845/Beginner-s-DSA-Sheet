// QL :- https://course.acciojob.com/idle?question=1cadff24-3c53-4d28-91a5-926f3be36854
import java.util.*;

class Solution {
	static boolean helper(int a[], int n, int i, int sum1, int sum2){
		if(i == n){
			if(sum1 % 10 == 0 && sum2 % 2 == 1){
				return true;
			}else{
				return false;
			}	
		}
	boolean ans1 =	helper(a, n, i+1, sum1 + a[i], sum2);
	boolean ans2 =	helper(a, n, i+1, sum1, sum2 + a[i]);
		return ans1 || ans2;
	}

static String GOT2(int a[], int n)
    {
        boolean ans =  helper(a,n, 0, 0, 0);
		if(ans){
			return "Jon";
		}else{
			return "Daenerys";
		}
    }

}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        
        Solution Obj = new Solution();
        System.out.print(Obj.GOT2(array,n));
    }
} 
