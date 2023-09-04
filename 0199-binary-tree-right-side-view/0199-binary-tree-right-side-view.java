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
    public List<Integer> rightSideView(TreeNode root) {
        List <Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null) return list;
        
        q.add(root);
        // list.add(root.val);
        while(q.isEmpty() == false){
            int count = q.size();
            for(int i = 0 ; i < count ; i++){
                TreeNode cur = q.poll();
                if(i == 0 ) list.add(cur.val);
                // System.out.print(cur.val);
                if(cur.right != null) q.add(cur.right);
                if(cur.left != null) q.add(cur.left);
            }
            // System.out.println();
        }
        return list;
    }
}