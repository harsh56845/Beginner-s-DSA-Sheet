// Ques Link :- https://course.acciojob.com/idle?question=c6e5e940-4699-46ef-85f8-9908dc6614de
import java.util.*;
class Solution {

	static int countways(int n)
	{
		// Iterative
		int steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                if ((n - 1) % 4 == 0 || n == 3) {
                    n -= 1;
                } else {
                    n += 1;
                }
            }
            steps++;
        }

        return steps;
		
		// Recursive
		// if(n==1)
		// 	return 0;

		// boolean isOdd = n%2!=0;

		// if(isOdd)
		// 	return Math.min(countways(n+1),countways(n-1))+1;
		// else
		// 	return countways(n/2)+1;
			
	}
}

public class Main{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(Solution.countways(n));
	}
}
