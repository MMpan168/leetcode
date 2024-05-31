public class Solution {
    // clarify : singly linked list
    // assume if input linkedlist is null or only one node, return this node
    // input a list node and a target output a list node
    // use dummy head
    // first create two dummy heads, one for smaller value one for larger value
    // iterate through linked list, if node.value < target, append this node to smaller dummy node,
    // otherwise append to larger dummy node
    // concatenate two linkedlist and tail of larger linked list should point to null
    // time =O(n) space =O(1)
    public ListNode partition(ListNode head, int target) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummySmall = new ListNode(0);
        ListNode dummyLarge = new ListNode(0);
        ListNode small = dummySmall;
        ListNode large = dummyLarge;
        while (head != null) {
            if (head.value < target) {
                small.next = head;
                head = head.next;
                small = small.next;
            } else {
                large.next = head;
                head = head.next;
                large = large.next;
            }
        }
        small.next = dummyLarge.next;
        large.next = null;
        return dummySmall.next;

    }
}
