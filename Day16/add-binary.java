// QL :- https://leetcode.com/problems/add-binary/
class Solution {
    public String addBinary(String a, String b) {
        // StringBuilder sb = new StringBuilder();
        String sb = "";
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        // 0 + 0 = 0
        // 0 + 1 = 1
        // 1 + 0 = 1
        // 1 + 1 = 10
        // 1 + 1 + 1 = 11
        // sum = 0 / 1/ 2 / 3
        // sum = 0.c=0 ans=0. sum =1 c=0 ans =1; sum=2 c=1 , sum =0;, sum =3 ,c=1,sum=1
        while(i >= 0 || j >= 0 || carry == 1){ // 1)  1 1 1   2) 1 1 brb --- charA (i)
            if(i >= 0){                            
              carry += a.charAt(i)-'0'; // '1' -'0' == 1 == carry = 1 +1 = 2 carry = 1+1 = 2
              i--; 
            }
            if(j >= 0){
                carry += b.charAt(j) -'0'; // 1 '0' = 1 carry = 2+1== 3
                j--;
            }
           
           int c = carry % 2; // = 2 % 2 = 0;  3 % 2 = 1 2% 2= 0; 1 % 2 -- 1
        //    sb.append(c);   // string = 0--1--0-- 1 "0101";
            sb = String.valueOf(c) + sb;
           carry = carry/2; // 2/2 = 1 que 3/2 = 1 = 2/2 = 1 carry 1/2 -- 0
        }
      return sb;
    }
}
