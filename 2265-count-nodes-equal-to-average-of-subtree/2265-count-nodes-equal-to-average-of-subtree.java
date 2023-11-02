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
    public int averageOfSubtree(TreeNode root) {
        int [] ans = new int[1];
        traverse(root,ans);
        return ans[0];
    }
    public int[] traverse(TreeNode node, int[]ans){
        if(node == null) return new int[]{0,0};
        
        int[]left = traverse(node.left,ans);        
        int[]right = traverse(node.right,ans);
        
        int curSum = left[0] + right[0] + node.val;
        int curCount = left[1] + right[1] + 1;
        
        if(curSum/curCount == node.val) ans[0]++;
        
        return new int[]{curSum,curCount};
    }
}