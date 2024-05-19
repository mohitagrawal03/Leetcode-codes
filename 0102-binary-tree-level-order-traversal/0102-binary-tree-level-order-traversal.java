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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l2d = new ArrayList<>();
        if (root == null) return l2d; // early return for null input
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        
        while(q.size() > 0){
            int levelSize = q.size(); // fixed size of current level
            List<Integer> tempList = new ArrayList<>();
            for(int i = 0; i < levelSize; i++){
                // r, p, a
                TreeNode temp = q.remove();
                tempList.add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            l2d.add(tempList);
        }
        return l2d;
    }
}