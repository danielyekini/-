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

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return arrayToBST(nums, 0, nums.length-1);
    }

    public TreeNode arrayToBST(int[] nums, int left, int right) {
        if (left > right) return null;
        int midpoint = left + (right-left) / 2;
        TreeNode node = new TreeNode(nums[midpoint], null, null);
        node.left = arrayToBST(nums, left, midpoint-1);
        node.right = arrayToBST(nums, midpoint+1, right);

        return node;
    }
}