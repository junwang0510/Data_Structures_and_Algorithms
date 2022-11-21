package LeetCode.NeetCode150.Trees;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
        new TreeNode(0, null, null);
    }

    public TreeNode(int val) {
        new TreeNode(val, null, null);
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
