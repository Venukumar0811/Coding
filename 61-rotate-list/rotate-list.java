/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0) return head;

        ListNode temp = head;
        int l = 1;

        while(temp.next != null){
            temp = temp.next;
            l++;
        }
        
        temp.next = head;
        k = k % l;
        int stepsToNewHead = l - k;

        ListNode newTail = temp;  
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
           
    }
}