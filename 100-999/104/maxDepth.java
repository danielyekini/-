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
    public int maxDepth(TreeNode root) {
        // recursivley check the depth of the root nodes children element 
        if (root == null) {return 0;}
        
        int depth = 1;

        int maxDepth = Math.max(maxDepth(root.left) + depth, maxDepth(root.right) + depth);
        return maxDepth;
    }
}