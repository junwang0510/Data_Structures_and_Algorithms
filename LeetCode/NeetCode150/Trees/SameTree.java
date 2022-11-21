package LeetCode.NeetCode150.Trees;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Runtime: O(n)
        // Space: O(1)

        // Recursive DFS

        // Base Case
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        // Normal Case
        if (p.val != q.val) return false;
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}
