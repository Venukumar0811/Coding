/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    int findMaxSum(Node root) {
        // code here
        int []max = {Integer.MIN_VALUE};
        slove(root,max);
        return max[0];
    }
    public int slove (Node root, int []max){
        if(root == null){
            return 0;
        }
        int left = Math.max(0,slove(root.left, max));
        int right = Math.max(0,slove(root.right, max));
        max[0] = Math.max(max[0], left+right+root.data);
        return root.data+Math.max(left,right);
    }
}