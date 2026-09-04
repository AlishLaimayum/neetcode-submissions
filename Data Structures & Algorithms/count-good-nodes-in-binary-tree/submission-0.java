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
    int sol=0;
    public void sol(TreeNode root,int max){
        if(root==null) return;
        if(root.val>=max) sol++;
        max=Math.max(max,root.val);
        sol(root.left,max);
        sol(root.right,max);
    }
    public int goodNodes(TreeNode root) {
        sol(root,Integer.MIN_VALUE);
        return sol;
    }
}
