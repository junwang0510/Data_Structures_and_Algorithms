package LeetCode.NeetCode150.Trees;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        // Runtime: O(n)
        // Space: O(n)

        // Recursive DFS
        if (root == null) return root;
        TreeNode node = new TreeNode(root.val);
        node.left = invertTree(root.right);
        node.right = invertTree(root.left);
        return node;
    }
}
