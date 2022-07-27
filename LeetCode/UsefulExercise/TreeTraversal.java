package LeetCode.UsefulExercise;

import java.util.*;

public class TreeTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(result, root);
        return result;
    }


    public void traverse(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        // Inorder traversal
        traverse(list, root.left);
        list.add(root.val);
        traverse(list, root.right);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
            this(0);
        }

        TreeNode(int val) {
            this(0, null, null);
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
