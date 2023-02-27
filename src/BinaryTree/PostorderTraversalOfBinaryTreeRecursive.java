package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import Util.TreeNode;

public class PostorderTraversalOfBinaryTreeRecursive {
    public List<Integer> postOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postOrder(root, res);
        return res;
    }

    private void postOrder(TreeNode root, List<Integer> res) {
        if (res == null) return;
        postOrder(root.left, res);
        postOrder(root.right, res);
        res.add(root.key);
    }
}
