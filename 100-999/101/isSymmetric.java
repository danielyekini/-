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


/**
 * Key Points
 *      - symmetiric: at each level values occur in opposite positions i.e. 3443
 * DFS - recurrsive
 *      1) use helper function dfs(a, b) where a and b are the nodes to be compared
 *      2) recursively call  dfs(a, b), if a or b is null return a == b
 *      3) on each call compare the value of the two current nodes if they are not
 *          equal return false
 *      4) call dfs(a,b) on opposing child nodes (i.e. left, right), then vice versa
 * 
 * 
 * BFS - iterative: compare nodes line by line
 *      1) queue nodes at the current depth to be compared 
 *      2) dequeue the first and last nodes
 *      3) if one of the dequeued nodes is null return first == last
 *      3) compare dequeued nodes if values are different return false
 *      4) queue children of first dequeued node then any node left in the queue the last dequeued node l to r
 *      5) repeat for each node in tree until no nodes are left to be dequeued 
 *      6) return true
 */

class dfsSolution {
    public boolean isSymmetric(TreeNode root) {

        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }

        if (left.val != right.val) {
            return false;
        }

        return dfs(left.left, right.right) && dfs(left.right, right.left);
    }
}

class bfsSolution {
    public boolean isSymmetric(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<>();

        q.add(root.left);
        q.add(root.right);

        while (!q.isEmpty()) {
            TreeNode a = q.removeFirst();
            TreeNode b = q.removeFirst();

            if (a == null && b == null) continue;
            if (a == null || b == null) return false;
            if (a.val != b.val) return false;

            q.add(a.left);
            q.add(b.right);

            q.add(a.right);
            q.add(b.left);
        }
        
        return true;
    }
}