package LeetCode.NeetCode150.Trees;

public class Diameter {
    // Runtime: O(n)
    // Space: O(n)

    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        longestPath(root);
        return max;
    }

    // return the length of the longest path from the root to the bottom of the tree
    private int longestPath(TreeNode root) {
        if (root == null) return 0;
        int left = longestPath(root.left);
        int right = longestPath(root.right);
        // update max by summing the longest paths from left and right
        max = Math.max(left + right, max);
        return 1 + Math.max(left, right);
    }
}
