package RecursionII;

import Util.TreeNode;

public class LowestCommonAncestorI {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode one, TreeNode two) {
        if (root == null) return null;
        if (root == one || root == two) return root;
        TreeNode l = lowestCommonAncestor(root.left, one, two);
        TreeNode r = lowestCommonAncestor(root.right, one, two);
        if (l != null && r != null) return root;
        return l == null ? r : l;
    }

}
