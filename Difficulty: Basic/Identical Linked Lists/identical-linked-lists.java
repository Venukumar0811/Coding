/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        // code here
        Node temp1 = head1;
        Node temp2 = head2;
        
        while(temp1 != null && temp2 != null){
            
            if(temp1.data != temp2.data) return false;
            
            temp1 = temp1.next;
            temp2 = temp2.next;
            
        }
        
        return temp1 == null && temp2 == null;
    }
}