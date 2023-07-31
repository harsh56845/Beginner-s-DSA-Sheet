// QL :- https://leetcode.com/problems/add-binary/submissions/
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int c = 0;
        while(i>=0 || j>=0){
            int sum = c;
            if(i>=0){
                sum+= a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+= b.charAt(j)-'0';
                j--;
            }
            if(sum==0){
                str.append("0");
                c = 0;
            }else if(sum==1){
                str.append("1");
                c = 0;
            }
            else if(sum==2){
                str.append("0");
                c =1;
            }else if(sum==3){
                str.append("1");
                c =1;
            }
        }
        if(c==1) str.append("1");
        return str.reverse().toString();
    }
}
