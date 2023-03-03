package BinaryTree;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PostorderTraversalOfBinaryTreeIterative {
    public List<Integer> postOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.offerFirst(root);
        TreeNode pre = null;

        while (!stack.isEmpty()) {
            TreeNode cur = stack.peekFirst();
            if (pre == null || cur == pre.left || cur == pre.right) {
                if (cur.left != null) stack.offerFirst(cur.left);
                else if (cur.right != null) stack.offerFirst(cur.right);
                else {
                    res.add(cur.key);
                    stack.pollFirst();
                }
            } else if (pre == cur.left) {
                if (cur.right != null) stack.offerFirst(cur.right);
                else {
                    res.add(cur.key);
                    stack.pollFirst();
                }
            } else { // pre == cur.right
                res.add(cur.key);
                stack.pollFirst();
            }
            pre = cur;
        }

        return res;
    }
}
