package RecursionII;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public List<List<Integer>> nqueens(int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        dfs(n, cur, res);
        return res;
    }

    private void dfs(int n, List<Integer> cur, List<List<Integer>> res) {
        if (cur.size() == n) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (valid(cur, i)) {
                cur.add(i);
                dfs(n, cur, res);
                cur.remove(cur.size() - 1);
            }
        }
    }

    private boolean valid(List<Integer> cur, int col) {
        int row = cur.size();
        for (int i = 0; i < row; i++) {
            if (cur.get(i) == col || Math.abs(cur.get(i) - col) == row - i) return false;
        }
        return true;
    }
}
