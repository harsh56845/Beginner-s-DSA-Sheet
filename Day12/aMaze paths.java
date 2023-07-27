// QL :- https://course.acciojob.com/idle?question=bb073cbd-0873-4607-824f-35edc0041c02
import java.util.*;
import java.io.*;
public class Main {
    public static void aMazePaths(int r, int c, String psf,int h , int v){
		// out of limit
		if(h>c || v>r) return;
	    // ans base cond
		if(h==c && v==r){
			System.out.println(psf);
			return;
		}
		// first horixantal
		aMazePaths(r,c,psf+"h",h+1,v);
		// secont vertical
		aMazePaths(r,c,psf+"v",h,v+1);
		
    }
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        inputLine = br.readLine().trim().split(" ");
        int m = Integer.parseInt(inputLine[0]);
        aMazePaths(n, m, "",1,1);
  }
}
