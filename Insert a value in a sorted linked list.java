public class Solution {
    // clarify: singly sorted linked list
    // assume: if input ListNode is null, return targetNode, if target < head.value, return targetNode
    // input a listnode and a target, output a listnode
    // use dummy head
    // first if input listnode is null or target < head.value return target node
    // pre pointer, pre = head, when pre.next != null and pre.next.value <= target, keep moving pre, pre = pre.next
    // when get out of loop, tagetNode.next = pre.next, pre.next = targetNode
    // time = O(n) Space = O(1)
    public ListNode insert(ListNode head, int value) {
        ListNode newHead = new ListNode(value);
        if (head == null || value < head.value) {
            newHead.next = head;
            return newHead;
        }
        ListNode pre = head;
        while (pre.next != null && value > pre.next.value) {
            pre = pre.next;
        }
        newHead.next = pre.next;
        pre.next = newHead;
        return head;
    }
}
