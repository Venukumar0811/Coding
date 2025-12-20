/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> a=new ArrayList<>();
        view(root,0,a);
        return a;
        
    }
    public static void view(Node root,int l,ArrayList<Integer> a)
    {
        if(root==null)return;
        if(l==a.size())
        {
            a.add(root.data);
        }
        view(root.left,l+1,a);
        view(root.right,l+1,a);
    }
}