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
    static Map<Integer,List<TreeNode>> map = new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        if(n%2 ==0){return new ArrayList<>();}
        if(!map.containsKey(n)){
            List<TreeNode> list = new ArrayList<>();
            if(n==1)list.add(new TreeNode(0));
            else{
                for(int i = 1 ; i < n ; i+=2){
                    List<TreeNode> ltree = allPossibleFBT(i);
                    List<TreeNode> rtree = allPossibleFBT(n-i-1);
                    for(TreeNode lt : ltree){
                        for(TreeNode rt : rtree){
                            list.add(new TreeNode(0,lt,rt));
                        }
                    }
                }
            }
            map.put(n,list);
        }
        return map.get(n);
    }
}