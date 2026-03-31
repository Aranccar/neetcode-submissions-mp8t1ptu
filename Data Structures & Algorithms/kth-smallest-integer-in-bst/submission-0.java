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
    int res = 0;
    int lim;
    public int kthSmallest(TreeNode root, int k) {
        lim = k;
        dfs(root);
        return res;
    }

    void dfs(TreeNode node){
        if(node == null){
            return;
        }
        dfs(node.left);
        if(lim <= 0){
            return;
        }
        res = node.val;
        lim--;
        dfs(node.right);

    }
}
