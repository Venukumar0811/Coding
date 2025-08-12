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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode  b= head;

        while(b != null && b.next != null){
            if(b.val == b.next.val){
                b.next = b.next.next;
            }
            else{
                b = b.next;
            }
        }

        return head;
    }
}