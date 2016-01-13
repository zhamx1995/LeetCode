/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        ArrayList<Integer> allsums = sums(root);
        for(int i = 0;i<allsums.size();i++){
            if(sum == allsums.get(i)){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Integer> sums(TreeNode cur){
        ArrayList<Integer> result = new ArrayList<>();
        
        if(cur.left != null){
        result.addAll(sums(cur.left));
        }
        if(cur.right != null){
        result.addAll(sums(cur.right));
        }
        
        if(result.size() == 0){
            result.add(cur.val);
            return result;
        }
        
        for(int i = 0;i<result.size();i++){
            int val = result.get(i);
            result.set(i,val+cur.val);
        }
        return result;
    }
}