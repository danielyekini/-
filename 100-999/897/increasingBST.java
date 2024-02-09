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
Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.

 */


/**
 Key points:
        - rearrange tree in-order: in-order traversal
        - left pointer of every node is null
        
 10  ->  15  ->  18
 |      
 v      
 5 -> 7 -> 9   
 |    |
 v    v
 3    6

 3 -> 5 -> 6 -> 7 -> 10 -> 15 -> 18


 Naive:
        - perform in-order traversal through the tree adding each node to a list
        - the list will be in order
        - turn the sorted list into a tree
        - time: O(n)
        - space: O(n) - size of list

 Approach:
        - treeToList(TreeNode root, List<TreeNode> list) -> List<TreeNode>: returns the tree as an in-order/sorted list
            - in-order traversal 
            - base case: if node has no children add it to the list and return list
            - recursive step: 
                - call left child
                - add current node to the list
                - call the right child
        - listToTree(List<TreeNodes> list) -> TreeNode root: returns the list as a tree where every node has no left child and only one right child, the next node in the list
            - iterate through list 
            - for each node in list set its left to null and its right to the next node in the lust
 */



 class Solution {
    private TreeNode current;

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) return null;

        TreeNode dummy = new TreeNode(0);
        current = dummy;
        inOrderTraversal(root);

        return dummy.right;
    }

    private void inOrderTraversal(TreeNode node) {
        if (node == null) return;

        inOrderTraversal(node.left);

        node.left = null;
        current.right = node;
        current = node;

        inOrderTraversal(node.right);
    }
}