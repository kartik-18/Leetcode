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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)return list;
        Queue<TreeNode> q = new LinkedList<>();
        Stack<Integer> s = new Stack<Integer>();
        q.add(root);
        boolean reverse = false;
        while(q.isEmpty() == false){
            int count = q.size();
            List<Integer> li = new ArrayList<>();
            for(int i = 0 ; i < count ; i++){
                TreeNode cur = q.poll();
                if(reverse)s.push(cur.val);
                else{
                   li.add(cur.val);
                }
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);   
            }
            if(reverse){
                    while(s.isEmpty() == false){
                        li.add(s.pop());
                    }
                }
            reverse = !reverse;
            list.add(li);
            
        }
        return list;
    }
}