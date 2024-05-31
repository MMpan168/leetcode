// assume: if input treenode is null, return null, if not found return null
// input a tree node and target, output a tree node
// recursive method
// base case: when root == null, return root, or if root.value == target, return root
// if target < root.value, go to left
// if target > root.value, go to right
// Time O(height) in each level time O(1), worst O(n)
// Space O(height)

//                                10 == root
//                              /     \
//                           5        15
//                        /    \      /      \
//                     2       7   12   20
//recursion:
public class Solution {
    public TreeNode searchBST(TreeNode root, int key) {
        if (root == null || root.key == key) {
            return root;
        }
        if (key < root.key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    //iteration:
    public TreeNode search(TreeNode root, int key) {
        TreeNode cur = root;
        while (cur != null && cur.key != key) { // terminate condition.
            if (key < cur.key) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return cur;     //exit while loop: currentNode = null || currentNode.key == target
    }
}