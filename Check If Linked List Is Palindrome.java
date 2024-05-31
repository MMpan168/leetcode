public class Solution {
    // clarify: singly linkedlist
    // assume: if input linked list is null or one node, return this node;
    // input a listnode, output a boolean
    // two pointers method
    // first find the middle node, split the linkedlist into two halves
    // reverse the second half, use two pointer for each half, iterate through the linked list,
    // compare with each other, if there is a different return false
    // else return true
    // time = O(n) space = O(1)
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode mid = findMid(head);
        ListNode two = mid.next;
        mid.next = null;
        ListNode right = reverse(two);
        while (head != null && right != null) {
            if (head.value != right.value) {
                return false;
            }
            head = head.next;
            right = right.next;
        }
        return true;
    }
}