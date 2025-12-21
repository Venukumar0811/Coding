class Solution {
    public boolean isBalanced(String s) {
        // code here
        
        Stack<Character> st=new Stack<>();
        HashSet<Character> set=new HashSet<>();
        set.add('(');
        set.add('{');
        set.add('[');
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
               if(ch==')' && st.peek()=='(' || ch==']' && st.peek()=='[' || ch=='}' && st.peek()=='{'){
                   st.pop();
               }
               else return false;
            }
        }
        
        if(st.isEmpty()) return true;
        return false;
    }
}
