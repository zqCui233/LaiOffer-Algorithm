package RecursionII;

import Util.TreeNode;

public class MaximumPathSumBinaryTreeII {
    public int maxPathSum(TreeNode root) {
        int[] max = new int[]{Integer.MIN_VALUE};
        maxPathSum(root, max);
        return max[0];
    }

    private int maxPathSum(TreeNode root, int[] max) {
        if (root == null) return 0;
        int l = maxPathSum(root.left, max);
        int r = maxPathSum(root.right, max);

         l = l < 0 ? 0: l;
         r = r < 0 ? 0: r;
         max[0] = Math.max(max[0], root.key + l + r);
         return root.key + Math.max(l ,r);
    }
}
