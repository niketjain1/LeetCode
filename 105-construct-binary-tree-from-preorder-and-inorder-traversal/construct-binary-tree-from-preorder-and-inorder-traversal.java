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
    private TreeNode constructBinaryTree(int[] preorder, int startPre, int endPre, int[] inorder, int startIn, int endIn, HashMap<Integer, Integer> map) {
        if (startIn > endIn) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[startPre]);
        int index = map.get(root.val);
        int numsLeft = index - startIn;
        root.left = constructBinaryTree(preorder, startPre + 1, startPre + numsLeft, inorder, startIn, index - 1, map);
        root.right = constructBinaryTree(preorder, startPre + numsLeft + 1, endPre, inorder, index + 1, endIn, map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return constructBinaryTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

}