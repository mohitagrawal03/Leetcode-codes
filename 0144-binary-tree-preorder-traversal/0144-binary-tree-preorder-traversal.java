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
        List<Integer> l = new ArrayList<>();
        preorderTraversalHelper(root, l);
        return l;
    }
    public void preorderTraversalHelper(TreeNode node, List<Integer> l){
        if(node == null) return;
        l.add(node.val);
        preorderTraversalHelper(node.left, l);
        preorderTraversalHelper(node.right, l);
    }
}