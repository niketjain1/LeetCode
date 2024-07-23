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
    private void traverseTree(TreeNode root, List<Integer> leafNodes) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leafNodes.add(root.val);
        }
        traverseTree(root.left, leafNodes);
        traverseTree(root.right, leafNodes);
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List leafNodes1 = new ArrayList<Integer>();
        List leafNodes2 = new ArrayList<Integer>();

        traverseTree(root1, leafNodes1);
        traverseTree(root2, leafNodes2);
        
        return leafNodes1.equals(leafNodes2);
    }   
}