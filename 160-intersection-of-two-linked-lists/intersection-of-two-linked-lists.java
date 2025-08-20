/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pt1 = headA;
        ListNode pt2 = headB;

        while(pt1 != pt2){
            if(pt1 == null){
                pt1 = headB;
            }
            else{
                pt1 = pt1.next;
            }
            if(pt2 == null){
                pt2 = headA;
            }
            else{
                pt2 = pt2.next;
            }
            
        }
        return pt1;
    }
}