public class Solution {
    // clarify： singly linked list
    // assume: if input list node is null or one node, return this node
    // input a listnode, output a listnode
    // use dummy head
    // first find the middle node and split this linked list into two halves
    // reverse the second half
    // merge two halves together merge one node from first and then from second
    public ListNode reorder(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = findMid(head);
        ListNode second = mid.next;
        mid.next = null;
        ListNode newSecond = reverse(second);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (head != null && newSecond != null) {
            cur.next = head;
            head = head.next;
            cur = cur.next;
            cur.next = newSecond;
            newSecond = newSecond.next;
            cur = cur.next;
        }
        if (head == null) {
            cur.next = newSecond;
        } else {
            cur.next = head;
        }
        return dummy.next;
    }
