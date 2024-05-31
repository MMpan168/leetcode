// assume: if no keys in the given range, return empty list
// input a tree node and range, output a list of integer
// recursive method
// base case: when root == null, return
// if root.value < lower bound, we don't need to go to left
// if root.value > upper bound, we don't need to go to right
// if lower bound < root.value < upper bound, add this node to list
// Time O(n) worst  O(height + # of nodes in the range of [k1, k2])
// Space O(height)

//[ k1 = 16,  ←   x   →   K2 = 50]                                              // in order.
//                                10 == root
//                              /     \
//                           5        15
//                        /    \      /      \
//                     2       7   12   20
public class Solution {
    public List<Integer> getRange(TreeNode root, int min, int max) {
        List<Integer> list = new ArrayList<>();
        getRange(root, min, max, list);
        return list;
    }

    public void getRange(TreeNode root, int min, int max, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (min < root.key) {
            getRange(root.left, min, max, list);
        }
        if (min <= root.key && root.key <= max) {
            list.add(root.key);
        }
        if (root.key < max) {
            getRange(root.right, min, max, list);
        }
    }
}