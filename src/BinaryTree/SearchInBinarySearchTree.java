package BinaryTree;

import Util.TreeNode;

public class SearchInBinarySearchTree {
    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.key == key) return root;
        if (root.key > key) return search(root.left, key);
        else return search(root.right, key);
    }
    public TreeNode search2(TreeNode root, int key) {
        TreeNode cur = root;
        while (cur != null && cur.key != key) {
            cur = cur.key < key ? cur.right : cur.left;
        }
        return cur;
    }
}
