// assume: if input tree node is null, return true
// input a tree node, output a boolean
// recursive method
// base case: when root == null, return true
// image we get height return from left subtree and right subtree
// in current level, we need to make sure left subtree is balanced and right sub tree is balanced
// and need to make sure current node left subtree and right subtree height difference <= 1
// if this tree is balanced, Time O(nlogn)  Space O(logn)
// if this tree is not balanced, Time O(n)  Space O(n)
//                          isBalanced(root: n nodes)
//                          getHeight(C1) getHeight(C2)      Time spent in this node = O(n)
//                                          n/2 + n/2
//                       /                                              \
//isBalanced(C1: n/2 nodes)                             isBalanced(C2: n/2 nodes)
//getHeight(C11) getHeight(C12)      O(n/2)        getHeight(C21) getHeight(C22)   O(n/2)      2*  O(n/2)
//                  n/4 + n/4                                                     n/4 + n/4
//              /               \                                                    /               \
//isBalanced(C11)    isBalanced(C12)            isBalanced(C21)     isBalanced (C22)              4*  O(n/4)
//  n/8 + n/8                  n/8 + n/8                          n/8 + n/8                n/8 + n/8

//Height = log(n) levels   Each level time = O(n)
//Thus, total time = n + n/2 * 2 + n/4* 4+   = O(n log n)
public class CheckBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int height = height(root);
        if (height == -1) {
            return false;
        }
        return true;           // return height(root) != -1;  use -1 to denote the tree is not balanced.
    }                            //  >= value means the tree is balanced and it is the height of the tree.

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }                     // if left subtree is already not balanced, we do not need to continue
        int leftHeight = height(root.left);   // and we can return -1 directly.
        int rightHeight = height(root.right);
        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) { // if not balanced, return -1.
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}