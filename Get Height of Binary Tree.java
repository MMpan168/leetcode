// assume: if input tree node is null, return zero
// input a tree node, output an int
// recursive method
// base case: when root == null, return 0
// image getHeight return from left subtree and right subtree
// in current level, we need to compare the height from left and right, then add 1
// and then return to upper level
// Time O(n)  Space O(height), worst case O(n)
public class Solution {
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        int current = Math.max(leftHeight, rightHeight) + 1;
        return current;
    }
}