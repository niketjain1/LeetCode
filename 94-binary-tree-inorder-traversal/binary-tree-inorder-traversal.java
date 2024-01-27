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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<TreeNode>();
        TreeNode current = root;
        while(!stk.isEmpty() || current != null) {
            if (current != null) {
                stk.push(current);
                current = current.left;
            } else {
                TreeNode topNode = stk.peek();
                arr.add(topNode.val);
                current = topNode.right;
                stk.pop();
            }
        }
        return arr;
    }
}