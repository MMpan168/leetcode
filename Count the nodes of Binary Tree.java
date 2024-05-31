// assume: if input tree node is null, return zero
// input a tree node, output an int
// recursive method
// base case: when root == null, return 0
// image countNodes return from left subtree and right subtree
// in current level, we need to add number of nodes from left and right, then add 1
// and then return to upper level
// Time O(n)  Space O(height), worst case O(n)
public class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int countNodes(TreeNode root) {
        if (root == null) { // base case
            return 0;
        }
        // what is the recursive definition?
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return 1 + left + right;
    }
}