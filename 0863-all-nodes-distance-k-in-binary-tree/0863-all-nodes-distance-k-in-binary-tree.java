/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<TreeNode> ntrAl = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        nodeToRootPath(root, target.val, ntrAl);
        for (int i = 0; i < ntrAl.size(); i++) {
            KLevelDown(ntrAl.get(i), k - i, (i == 0) ? null : ntrAl.get(i - 1), res);
        }
        return res;
    }

    public boolean nodeToRootPath(TreeNode node, int searchEle, List<TreeNode> ntrAl) {
        if (node == null) return false;

        if (node.val == searchEle) {
            ntrAl.add(node);
            return true;
        }

        if (nodeToRootPath(node.left, searchEle, ntrAl)) {
            ntrAl.add(node);
            return true;
        }

        if (nodeToRootPath(node.right, searchEle, ntrAl)) {
            ntrAl.add(node);
            return true;
        }

        return false;
    }

    public void KLevelDown(TreeNode node, int k, TreeNode blocker, List<Integer> res) {
        if (node == null || node == blocker) return;
        if (k == 0) {
            res.add(node.val);
            return;
        }

        KLevelDown(node.left, k - 1, blocker, res);
        KLevelDown(node.right, k - 1, blocker, res);
    }
}