package BinaryTree;

import Util.TreeNode;

public class SymmetricBinaryTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        else if (l == null || r == null) return false;
        else if (l.key != r.key) return false;
        return isSymmetric(l.left, r.right) && isSymmetric(l.right, r.left);
    }
}
