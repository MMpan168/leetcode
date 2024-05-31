// input two tree nodes, output a boolean
// recursive method
// from root node, we need to find out if root1 left subtree identical to root2 left subtree
// and root1 right subtree identical to root2 right subtree
// or root1 left subtree identical to root2 right subtree
// and root1 right subtree identical to root2 left subtree
// image current level, root1 left subtree identical to root2 left subtree
// for root1 and root2, we need to compare, if they are not equal, return false
// Time = O(n^2)  worst  Space O(height)  O(n) worst case



//case1.   8a      AND      8b             OR               case 2   8a     AND          8b
//           /      \                 /     \                                            /     \                    /      \
//        4a      5a           4b      5b                                     4a      5a              5b      4b
//          |                        |                                                  |                                     |
//          7                       7                                                7                                     7

public class Solution {
    public boolean isTweakedIdentical(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }                                  // 这里可以改成else if
        if (left == null || right == null) {
            return false;
        }                                  // 这里可以改成else if
        if (left.key != right.key) {
            return false;
        }
        return isTweakedIdentical(left.left, right.left) && isTweakedIdentical(left.right, right.right) ||
                isTweakedIdentical(left.left, right.right) && isTweakedIdentical(left.right, right.left);
    }
}