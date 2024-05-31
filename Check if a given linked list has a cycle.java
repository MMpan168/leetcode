public class Solution {
    // clarify : singly linked list
    // assume: if input ListNode is null return false
    // input a ListNode, output a boolean
    // use two pointer method, slow and fast pointer
    // step 1, fast and slow pointer point to head
    // step 2, slow move one step and fast move two steps
    // if fast == slow return true
    // when fast.next or fast.next.next reach null stop moving
    // return false
    // time = O(n) space = O(1)
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
