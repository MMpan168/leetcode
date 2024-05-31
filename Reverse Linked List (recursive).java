public class Solution {
    // clarify: this is a singly linked list
    // assume: if input head is null return this head
    // input a linked list head, output a linked list head
    // use recursive method, reverse node one by one
    // base case: if head == null or head.next == null return head
    // image we have 1000 nodes, the subproblem is 999 nodes, assume 999 nodes are reversed by the same recursion and newHead is return
    // in current level, we only need to reverse current node, head.next.next = head, head.next = null and return newHead
    // time = O(n) n nodes in recursion tree, space = O(n) the recursion tree height is n
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
