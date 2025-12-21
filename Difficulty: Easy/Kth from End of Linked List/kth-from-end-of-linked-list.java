/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        if(k == 1 && head.next == null) return head.data;
        Node slow = head, fast = head;
        while(k != 0 && fast != null){
            fast = fast.next;
            k--;
        }
        if(k != 0) return -1;
        if(fast == null) return head.data;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.next.data;
    }
}