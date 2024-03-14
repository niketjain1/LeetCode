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
    private List<Double> ans = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        return levelOrderTraversal(root);
    }
    private List<Double> levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            Double avg = 0.0;
            Double count = 0.0;
            while (size-- > 0) {
                TreeNode currNode = q.poll();   
                avg += currNode.val;
                count++;
                if (currNode.left != null) {
                    q.offer(currNode.left);
                }
                if (currNode.right != null) {
                    q.offer(currNode.right);
                }
            }
            Double a = avg/count;
            ans.add(a);
        }
        return ans;
    }
}