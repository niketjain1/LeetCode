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
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode curr = root;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack<TreeNode>();
        while(!stk.isEmpty() || curr != null) {
            if (curr != null) {
                arr.add(curr.val);
                stk.push(curr);
                curr = curr.left;
            } else {
                TreeNode top = stk.peek();
                stk.pop();
                curr = top.right;
            }
        }
        return arr;
    }
}