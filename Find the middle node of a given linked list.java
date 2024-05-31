public class Solution {
    // clarify: singly linked list
    // assume: input listnNode is null, return this node, if there are even numbers nodes in the linked list, return the left one
    // input a ListNode, output a ListNode
    // use two pointers method, slow and fast
    // slow and fast pointer point to head,
    // slow move one step and fast move two steps
    // when fast.next reach null or fast.next.next reach null, stop moving
    // time = O(n) since there are n nodes, space = O(1) no addition data structure is used
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
