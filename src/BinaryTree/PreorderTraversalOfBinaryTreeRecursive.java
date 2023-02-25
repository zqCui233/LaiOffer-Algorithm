package BinaryTree;

import Util.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class PreorderTraversalOfBinaryTreeRecursive {
    public List<Integer> preOrder(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        preOrder(root, res);
        return res;
    }

    private void preOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        list.add(root.key);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{11,1,null,null,-1,-9,10,-5,6,-7,null,null,-6,15};
        TreeNode root = TreeNode.constructTree(arr);
        List<Integer> res = new PreorderTraversalOfBinaryTreeRecursive().preOrder(root);
        System.out.println(res);
    }
}
