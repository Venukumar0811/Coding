/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node temp = head;
        Node newnode = new Node(x);
        if(head == null){
            return newnode;
        }
        
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = newnode;
        return head;
    }
}