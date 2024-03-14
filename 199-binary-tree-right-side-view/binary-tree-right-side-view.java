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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> returnedList = levelOrderTraversal(root);
        for (int i = 0; i < returnedList.size(); i++) {
            int n = returnedList.get(i).size();
            result.add(returnedList.get(i).get(n - 1));
        }
        return result;
    }   
    private List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> mainList = new ArrayList<>();

        if (root == null) {
            return mainList;
        }

        Queue<TreeNode> q = new LinkedList<>();  
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> curr = new ArrayList<>();
            while(size-- > 0) {
                TreeNode currNode = q.poll();
                curr.add(currNode.val);
                if (currNode.left != null) {
                    q.offer(currNode.left);
                } 
                if (currNode.right != null) {
                    q.offer(currNode.right);
                }
            }
            mainList.add(curr);
        }
        return mainList;
    }
}