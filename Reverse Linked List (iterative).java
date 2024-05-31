public class Solution {
    // clarify: a singly linked list
    // assume: if input linked list is null or input linked list has one node, return this node
    // input a linked list head, output a linked list head
    // use iterative method, reverse one node by one node
    // first we need a previous reference pre = null, and a cur reference cur = head, and a next
    //  reference next = cur.next
    // reverse the node: cur.next = pre
    // move the node: pre = cur; cur = cur.next
    // termination: when cur node reach null, return pre as new head
    // time = O(n) space = O(1)
    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur !=null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;

    }
}
