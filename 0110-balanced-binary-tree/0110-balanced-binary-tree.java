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
    
//     public int bal(TreeNode root){
//         if(root == null) return 0 ;
//         int lh = bal(root.left);
//         if(lh == -1)return -1;
//         int rh = bal(root.right);
//         if(rh == -1) return -1;
        
//         if(Math.abs(lh - rh) > 1) return -1;
//         else return (Math.max(lh,rh) + 1);
//     }
    
    public int height(TreeNode root){
        if (root == null) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    
    public boolean isBalanced(TreeNode root) {
        
        // METHOD 1 :-  TC => O(N^2)
        
        if(root == null) return true;
        int lh = height(root.left);
        int rh = height(root.right);
        
        return Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        
        
// //         METHOD :- 2 
//         if(bal(root) == -1) return false;
//         return true;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}