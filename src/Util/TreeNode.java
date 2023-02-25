package Util;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int key) {
        this.key = key;
    }

    /*
    * Construct a binary tree in level order
    * */
    public static TreeNode constructTree(Integer[] array) {
        if (array == null || array.length == 0) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(array[0]);
        TreeNode cur = null;
        boolean isLeft = true;
        queue.offer(root);

        for (int i = 1; i < array.length; i++) {
            TreeNode temp = null;
            if (array[i] != null) {
                temp = new TreeNode(array[i]);
                queue.offer(temp);
            }

            if (isLeft) {
                cur = queue.poll();
                cur.left = temp;
            } else {
                cur.right = temp;
            }

            isLeft = !isLeft;
        }

        return root;
    }

}
