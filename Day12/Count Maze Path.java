// QL :- https://course.acciojob.com/idle?question=a5508cd1-b8dc-4bf3-a968-b42a488c3265
import java.io.*;
import java.util.*;

public class Main{
	// tc -> O(2^(n+m)) Sc-> O(n+m)
    static int countMazePath(int n, int m)
    {
		if(n<1 || m<1) return 0;
        if(n==1 && m==1) return 1;

		// horizon
		int hori = countMazePath(n,m-1);
		// vertical
		int verti = countMazePath(n-1,m);

		return hori + verti;
    }
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n;
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println(countMazePath(n, m));
    }
}
