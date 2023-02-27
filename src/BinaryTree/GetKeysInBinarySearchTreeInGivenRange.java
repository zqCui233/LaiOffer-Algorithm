package BinaryTree;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class GetKeysInBinarySearchTreeInGivenRange {
    public List<Integer> getRange(TreeNode root, int min, int max) {
        List<Integer> res = new ArrayList<>();
        getRange(root, min, max, res);
        return res;
    }

    private void getRange(TreeNode root, int min, int max, List<Integer> res) {
        if (min > max || root == null) return;
        if (root.key > min) getRange(root.left, min, max, res);
        if (root.key <= max && root.key >= min) res.add(root.key);
        if (root.key < max) getRange(root.right, min, max, res);
    }
}
