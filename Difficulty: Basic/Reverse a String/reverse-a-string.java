// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        int st=0,end=s.length()-1;
        char ch[]=s.toCharArray();
        while(st<=end){
            char temp=ch[st];
            ch[st]=ch[end];
            ch[end]=temp;
            st++;
            end--;
        }
        String res=new String(ch);
        return res;
    
    }
}