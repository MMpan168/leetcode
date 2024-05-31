// assume: if input tree node is null, return true
// input a tree node, output a boolean
// recursive method
// base case: when root == null, return true
// from root node, we need to find out if left subtree and right subtree are symmetric
// image current level, left subtree and right subtree is symmetric,
// for left node and right node, we need to compare, if they are not equal, return false
// Time since we need to compare left and right nodes, there are n nodes, so n/2 pairs
// Time = O(n/2) = O(n)  Space O(height)  O(n) worst

//                                                  root = <5a, 5b>
//                                              /           &&            \
//                                 c1 = <1a, 1b>                   c1 = <3a, 3b>
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }                                  // 这里可以改成else if
        if (left == null || right == null) {
            return false;
        }                                   // 这里可以改成else if
        if (left.key != right.key) {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}