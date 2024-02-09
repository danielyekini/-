// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


/**
You are given the root of a binary search tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
 */


/**

 Key points:
        - BST: nodes are in a specified order 
        - returning subtree i.e. TreeNode of target val

 Example:

 val = 18

 10  ->  15  ->  17
 |      
 v      
 5 -> 7   
 |
 v
 3

 Naive:
        - recursivley Search through the tree visiting each node until 
        node with target val is found
        - time: O(n)
        - space: O(n)

 Optimised:
        - As the tree is sorted we can navigate towards nodes that are closer 
        to the target value cutting the search space in half each time
        - time: O(log n)
        - space: O(log n)

 Approach:
        - base case: 
            - if the root.val == val return root
            - else if the root == null return null
        - recursive step: 
            - if root.val > val go left
            - if root.val < val go right

 */

 class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        else if (root.val == val) return root;

        if (root.val > val) 
            return searchBST(root.left, val);

        if (root.val < val) 
            return searchBST(root.right, val);

        return null;
    }
}