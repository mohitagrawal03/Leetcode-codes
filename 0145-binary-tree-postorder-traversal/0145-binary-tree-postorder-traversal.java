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
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> l = new ArrayList<>();
        postorderTraversalHelper(root, l);
        return l;
    }
    public void postorderTraversalHelper(TreeNode node, List<Integer> l){
        if(node == null) return;
        postorderTraversalHelper(node.left, l);
        postorderTraversalHelper(node.right, l);
        l.add(node.val);
    }
}