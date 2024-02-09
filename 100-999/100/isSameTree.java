import java.util.LinkedList;

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

class recursiveSolution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

class bfsSolution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;

        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(p);
        queue.add(q);

        while (!queue.isEmpty()) {
            System.out.println(queue);
            TreeNode pNode = queue.removeFirst();
            TreeNode qNode = queue.removeFirst();
            
            if (pNode.val != qNode.val) return false;
            
            if (pNode.left != null && qNode.left != null) {
                queue.add(pNode.left);
                queue.add(qNode.left);
            } 
            else if ((pNode.left != null && qNode.left == null) || (pNode.left == null && qNode.left != null)) return false;

            if (pNode.right != null && qNode.right != null) {
                queue.add(pNode.right);
                queue.add(qNode.right);
            }
            else if ((pNode.right != null && qNode.right == null) || (pNode.right == null && qNode.right != null)) return false;
        }

        return true;
    }
}