// QL :- https://course.acciojob.com/idle?question=9ecd1991-1197-4872-a44d-aff68aa6f20b
// TC -> O(2^n)  SC -> O(2^n)
import java.io.*;
import java.util.*;

public class Main {
	public static void helper(String str,String store,ArrayList<String> ans){
		if(str.length()==0){
			if(store.length()>0)
				ans.add(store);
			return;
		}
		// inclusive
		helper(str.substring(1),store+str.charAt(0),ans);
		// Exclusive
		helper(str.substring(1),store,ans);

	}
    public static ArrayList<String> generateSubsequences(String str)
    {
        ArrayList<String> ans = new ArrayList<String>();
		helper(str,"",ans);
		Collections.sort(ans);
		return ans;
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        ArrayList<String> res = generateSubsequences(s);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
