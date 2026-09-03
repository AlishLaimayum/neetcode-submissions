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
    int dia=0;
    public int depth(TreeNode root){
        if(root==null) return 0;
        int leftdepth=depth(root.left);
        int rightdepth=depth(root.right);
        dia=Math.max(dia,leftdepth+rightdepth);
        return 1+Math.max(leftdepth,rightdepth);
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return dia;
        
    }
}
