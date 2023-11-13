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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        TreeNode root1 = root;
        while(true){
            if(root1.val < val){
                if(root1.right != null){
                    root1 = root1.right;
                }
                else{
                    root1.right = new TreeNode(val);
                    break;
                }
            }
            else {
                if(root1.left != null){
                    root1 = root1.left;
                }
                else{
                    root1.left = new TreeNode(val);
                    break;
            }
        }
    }
    return root;
}
}