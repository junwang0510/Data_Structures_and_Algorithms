package LeetCode.NeetCode150.Trees;

public class MaxDepthOfTree {
    public int maxDepth(TreeNode root) {
        // Runtime: O(n)
        // Space: O(1)

        // Recursive DFS
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

        /*
        // Runtime: O(n)
        // Space: O(n)

        // BFS
        if (root == null) return 0;

        int level = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            // process level by level
            int s = q.size(); // need to store queue's original size as we are possibly adding elements to the queue
            for (int i = 0; i < s; i++) {
                TreeNode node = q.remove();
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            // finished processing one level
            level++;
        }

        return level;
         */
    }
}
