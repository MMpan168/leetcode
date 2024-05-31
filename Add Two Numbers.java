public class Solution {
    // clarify: singly linked list
    // assume: if one linked list is null return the other one, if both are null return null
    // input two list node, output one list node
    // use dummy node
    // first iterate through both linked list, if list nodes are not null add them to a new listnode,
    // if there is carry, add it to next node
    // continue to add numbers until there are no numbers in both linked list and there is no carry
    // time = O(n) n is the numbers of nodes of the longer linked list, space =O(1)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                carry += l1.value;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.value;
                l2 = l2.next;
            }
            ListNode node = new ListNode(carry % 10);
            carry = carry / 10;
            cur.next = node;
            cur = cur.next;
        }
        return dummy.next;
    }
}
