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
    public int depth(TreeNode root , int depth){
        if(root==null) return depth;
        int leftdepth=depth(root.left,depth+1);
        int rightdepth=depth(root.right,depth+1);
        return Math.max(leftdepth,rightdepth);

    }
    public int maxDepth(TreeNode root) {  
        return depth(root,0);
    }
}
