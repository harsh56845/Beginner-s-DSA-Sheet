// Q L :- https://course.acciojob.com/idle?question=117d315f-d2e8-4eb8-9e68-bd2322a59f84
import java.io.*;
import java.util.*;
class Solution{
	public void printPara(int n,int openCount,int closeCount,String asf){
		if(asf.length()==2*n){
			System.out.println(asf);
			return;
		}
		if(openCount<n){
			printPara(n,openCount+1,closeCount,asf+"(");
		}
		if(closeCount<openCount){
			printPara(n,openCount,closeCount+1,asf+")");
		}
	}
     public void generateParanthesis(int n){
		 printPara(n,0,0,"");
    }
}
public class Main { 
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Solution obj=new Solution();
        obj.generateParanthesis(n);
    }
}
