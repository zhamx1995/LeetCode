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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> curlist = new ArrayList<>();
        if(root == null){
            return curlist;
        }
        List<String> leftlist = binaryTreePaths(root.left);
        if(leftlist.size() > 0){
            for(String x: leftlist){
                curlist.add(Integer.toString(root.val) + "->" + x);
            }
        }
        List<String> rightlist = binaryTreePaths(root.right);
        if(rightlist.size() > 0){
            for(String x: rightlist){
                curlist.add(Integer.toString(root.val) + "->" + x);
            }
        }
        if(leftlist.size() == 0 && rightlist.size() == 0){
            curlist.add(Integer.toString(root.val));
        }
        return curlist;
        
    }
}