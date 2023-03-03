package BinaryTree;

import Util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class InorderTraversalOfBinaryTreeIterative {
    public List<Integer> inOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode helper = root;

        while (!stack.isEmpty() || helper != null) {
            if (helper != null) {
                stack.offerFirst(helper);
                helper = helper.left;
            } else {
                TreeNode cur = stack.pollFirst();
                res.add(cur.key);
                helper = cur.right;
//                if (helper != null) stack.offerFirst(helper);
            }
        }

        return res;
    }
}
