/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
     private boolean valid(Node root,long min,long max){
        if(root==null)return true;
        if(root.data<=min || root.data>=max)return false;
        return valid(root.left,min,root.data)&& valid(root.right,root.data,max);
    }
    boolean isBST(Node root) {
        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}