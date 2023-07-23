// 
import java.util.*;

class Solution {
    static int findInverse(int n)
    {
		// tc -> O(logN) Sc -> O(1)
		// count digits
		int len = 0;
		int num = n;
		while(num!=0){
			len++;
			num/=10;
		}
		// main logic -> same number -> digit*(10^pv-1) , for inverse nu -> pv*(10^digit-1);
		int inv_num = 0;
		int pv = 1;
		while(n!=0){
			int rem = n%10;
			if(rem<=len){
				inv_num+= pv*Math.pow(10,rem-1);
			}
			pv++;
			n/=10;
		}
		return inv_num;
		// tc -> O(logN) Sc -> O(logN)
		// int len = 0;
		// int num = n;
		// while(num!=0){
		// 	len++;
		// 	num/=10;
		// }
		// int[] arr = new int[len];
		// int pv = 1;
		// while(n!=0){
		// 	int index = n%10-1;
		// 	arr[index] = pv++;
		// 	n/=10;
		// }
		// int inverse_num = 0;
		// for(int i=arr.length-1;i>=0;i--)
		// 	inverse_num =inverse_num*10+arr[i];
		// return inverse_num;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.findInverse(n));
    }
}
