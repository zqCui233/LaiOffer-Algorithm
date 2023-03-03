package HeapAndGraphSearchI;

import Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CheckIfBinaryTreeIsCompleted {
    public boolean isCompleted(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur.left == null) flag = true;
            else if (flag) return false;
            else queue.offer(cur.left);

            if (cur.right == null) flag = true;
            else if (flag) return false;
            else queue.offer(cur.right);
        }

        return true;
    }
}
