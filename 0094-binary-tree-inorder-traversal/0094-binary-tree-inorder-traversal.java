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
    List<Integer> list = new ArrayList<Integer>();
        
    public void traverse(TreeNode root){
        if(root == null){return ;}
        if(root != null){
            traverse(root.left);
            list.add(root.val);
            traverse(root.right);
        }
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return list;
    }
}