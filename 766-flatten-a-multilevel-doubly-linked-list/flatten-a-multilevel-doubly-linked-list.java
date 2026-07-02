/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
class Solution {

    public Node flatten(Node head) {

        if (head == null)
            return head;

        Stack<Node> stack = new Stack<>();
        Node curr = head;

        while (curr != null) {

            if (curr.child != null) {

                if (curr.next != null)
                    stack.push(curr.next);

                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
            }

            if (curr.next == null && !stack.isEmpty()) {

                Node temp = stack.pop();
                curr.next = temp;
                temp.prev = curr;
            }

            curr = curr.next;
        }

        return head;
    }
}