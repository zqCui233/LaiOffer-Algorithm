package BinaryTree;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PreorderTraversalOfBinaryTreeIterative {
    public List<Integer> preOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.offerFirst(root);

        while (!stack.isEmpty()) {
            TreeNode cur = stack.pollFirst();
            res.add(cur.key);
            if (cur.right != null) stack.offerFirst(cur.right);
            if (cur.left != null) stack.offerFirst(cur.left);
        }

        return res;
    }
}
