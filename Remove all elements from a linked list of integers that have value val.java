public class Solution {
    // clarify: singly linked list
    // assume: if input list node is null return this node
    // input a list node and a target, output a list node
    // use dummy head
    // first create a dummy head and point to the head of linked list
    // iterate through linked list, if node.value == target, pre.next = cur.next
    // return dummy.next
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (head !=null) {
            if (head.value == val) {
                pre.next = head.next;
            } else {
                pre = head;
            }
            head = head.next;

        }
        return dummy.next;
    }
}
