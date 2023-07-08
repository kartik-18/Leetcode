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
     int sum = 0;
    public boolean hasPathSum(TreeNode root, int target) {
        if(root == null) return false;
        sum+=root.val;
        if(root.left==null && root.right==null && sum == target){
            return true;
        }
        boolean flag = hasPathSum(root.left,target) || hasPathSum(root.right,target);
        sum -= root.val;
        return flag;
    }
}