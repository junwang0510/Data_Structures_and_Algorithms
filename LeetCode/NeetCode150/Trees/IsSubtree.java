package LeetCode.NeetCode150.Trees;

public class IsSubtree {
    // Runtime: O(n)
    // Space: O(n)

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        return isSame(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSame(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return root1 == null && root2 == null;
        return root1.val == root2.val && isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
    }
}
