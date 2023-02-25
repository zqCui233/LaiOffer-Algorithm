package Util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int key) {
        this.key = key;
    }

    /**
     * Deconstruct tree in level order
     */
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


    /**
     * Deconstruct tree in level order
     */
    public static List<List<Integer>> deconstruct(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> layer = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur == null) {
                    layer.add(null);
                    continue;
                } else {
                    queue.add(cur.left);
                    queue.add(cur.right);
                    layer.add(cur.key);
                }
            }

            res.add(layer);
        }

        return res;
    }

}
