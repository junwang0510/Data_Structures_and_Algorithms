package Graph;

public class TreeNode {
    private int val; // value contained in the node
    private TreeNode left; // ref to left node
    private TreeNode right; // ref to right node

    // Constructors
    public TreeNode() {
        this(0);
    }

    public TreeNode(int val) {
        this(val, null, null);
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
