package BinaryTree;

import Util.TreeNode;

public class IsBinarySearchTreeOrNot {
    public boolean isBST(TreeNode root) {
        return isBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private boolean isBST(TreeNode root, int max, int min) {
        if (root == null) return true;
        if (root.key <= min || root.key >= max) return false;
        return isBST(root.left, root.key, min) && isBST(root.right, max, root.key);
    }
}
