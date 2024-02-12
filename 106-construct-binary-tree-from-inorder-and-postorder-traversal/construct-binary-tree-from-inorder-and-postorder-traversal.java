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
    public TreeNode constructBinaryTree(int[] inorder, int startIn, int endIn, int[] postorder, int startPost, int endPost, HashMap<Integer, Integer> map) {
        if (startIn > endIn) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[endPost]);
        int index = map.get(root.val);
        int numsLeft = index - startIn;
        root.left = constructBinaryTree(inorder, startIn, index - 1, postorder, startPost, startPost + numsLeft - 1, map);
        root.right = constructBinaryTree(inorder, index + 1, endIn, postorder, startPost + numsLeft, endPost - 1, map);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return constructBinaryTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }
}