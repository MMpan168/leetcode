public class Solution {
    // clarify : singly sorted linked list
    // assume: if input listnodes are null return null, if one list node is null return the other
    // input two list nodes, output one list node
    // use dummy head and two pointers
    // one pointer points to first list node, the other pointer points to second list node
    // compare two pointers, and append the smaller one to dummy head, move this pointer forward, until one pointer reach null, append the other pointer to
    // the new linked list
    // time = O(n) space =O(1)
    public ListNode merge(ListNode one, ListNode two) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (one != null && two != null) {
            if (one.value <= two.value) {
                cur.next = one;
                one = one.next;
            } else {
                cur.next = two;
                two = two.next;
            }
            cur = cur.next;
        }
        if (one == null) {
            cur.next = two;
        } else {
            cur.next = one;
        }
        return dummy.next;
    }
}
