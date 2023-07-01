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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null) return list;
        q.add(root);
        while(q.isEmpty() == false){
            List<Integer> li = new ArrayList<>();
            int count = q.size();
            for(int i = 0 ; i < count ; i++){
                TreeNode cur = q.remove();
                li.add(cur.val);
                if(cur.left!= null) q.add(cur.left);
                if(cur.right!= null) q.add(cur.right);
            }
            list.add(0,li);
        }
        return list;
    }
}