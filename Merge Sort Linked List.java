public class Solution {
    // clarify: singly linkedlist
    // assume: if input list node is null or input linkedlist has one node, return this node
    // input a listnode output a listnode
    // recursive method
    // first find the middle node and split the linked list into two halves
    // sort each half recursively using the same method
    // after the two halves are sorted merge them together
    // time =O(nlogn) space = O(logn)
    public ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = findMid(head);
        ListNode right = mid.next;
        mid.next = null;
        ListNode newLeft = mergeSort(head);
        ListNode newRight = mergeSort(right);
        return merge(newLeft, newRight);

    }
}