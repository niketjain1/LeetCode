/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        int count = 0;
        Stack<TreeNode> stk = new Stack<TreeNode>();
        while (!stk.isEmpty() || root != null) {
            if (root != null) {
                count++;
                stk.push(root);
                root = root.left;
            } else {
                TreeNode top = stk.peek();
                stk.pop();
                root = top.right;
            }
        }
        return count;
    }
}