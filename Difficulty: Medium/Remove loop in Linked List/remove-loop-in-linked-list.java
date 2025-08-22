/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node slow = head, fast = head;
        
        boolean loopexists = false;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                loopexists = true;
                break;
            }
        }
        
        if(!loopexists) return;
        
        slow = head;
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
        }
        else {
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        fast.next = null;

    }
}