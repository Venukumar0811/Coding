/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node i = head1;
        Node j = head2;
        
        Node dummy = new Node(-1);
        Node curr = dummy;
        
        while(i != null && j != null){
            
            if(i.data < j.data){
                curr.next = i;
                i = i.next;
            }
            else{
                curr.next = j;
                j = j.next;
            }
            curr = curr.next;
        }
        if(i == null){
        curr.next =j;
        }
        else{
        curr.next =i;
        }
        
        return dummy.next;
    }
}