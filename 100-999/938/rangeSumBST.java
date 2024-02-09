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
 10  ->  15  ->  18
 |      
 v      
 5 -> 7   
 |
 v
 3

 Naive
        - perform postorder dfs visiting each node
        - base case: if a node is null return 0
        - recursive step: for each child node if node.val falls within 
            range add it to running sum
        - Time: O(n)
        - Space: O(n)

Optimisation
        - if a nodes value falls out of range, branches that fall further out of
        range can be skipped i.e. if node.val > high, we can skip checking its left 
        values as they will all be greater than high
 */


 class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;

        int sum = 0;
        
        if (root.val > low)
            sum += rangeSumBST(root.left, low, high);


        if (root.val < high)
            sum += rangeSumBST(root.right, low, high);


        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }

        return sum;
    }
}