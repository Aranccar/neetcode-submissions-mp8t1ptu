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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        int curSum = targetSum - root.val;
        if(root.left == null && root.right == null && curSum == 0){
            return true;
        }
        if(hasPathSum(root.left, curSum)){
            return true;
        }
        if(hasPathSum(root.right, curSum)){
            return true;
        }
        return false;
    }
}