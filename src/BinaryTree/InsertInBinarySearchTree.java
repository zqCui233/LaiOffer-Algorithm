package BinaryTree;

import Util.TreeNode;

public class InsertInBinarySearchTree {
    public TreeNode insert(TreeNode root, int key) {
        if (root == null) return new TreeNode(key);
        if (root.key > key) root.left = insert(root.left, key);
        else if (root.key < key) root.right = insert(root.right, key);
        return root;
    }

    public TreeNode insert2(TreeNode root, int key) {
        if (root == null) return new TreeNode(key);
        TreeNode cur = root;
        while (cur.key != key) {
            if (cur.key > key) {
                if (cur.left == null) cur.left = new TreeNode(key);
                cur = cur.left;
            } else {
                if (cur.right == null) cur.right = new TreeNode(key);
                cur = cur.right;
            }
        }
        return root;
    }
}
