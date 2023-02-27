package BinaryTree;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversalOfBinaryTreeRecursive {
    public List<Integer> inOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrder(root, res);
        return res;
    }

    private void inOrder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        inOrder(root.left, res);
        res.add(root.key);
        inOrder(root.right, res);
    }
}
