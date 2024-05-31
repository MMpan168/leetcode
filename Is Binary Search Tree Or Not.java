// assume: if input tree node is null, return true
// input a tree node, output a boolean
// recursive method
// base case: when root == null, return true
// every node in the left subtree must smaller than root every node in the right subtree must bigger
// so we must pass the value of root down to next level to compare with
// in current level if node.value <= min or node.value >= max, return false
// Time O(n) n nodes, each node O(1) Space O(height) O(n) worst case

//                                         10 (min=-inf, max= +inf)   == root
//                                       /                                  \
//                       5 [min=-inf, max=10)      AND      15
//                         /         \                                       /       \
//   2(min=-inf, max=5)  X(min=5, max=10)        12       20

public class Solution {
    public boolean isBST(TreeNode root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.key <= min || root.key >= max) {
            return false;
        }
        return isBST(root.left, min, root.key) && isBST(root.right, root.key, max);
    }
}
