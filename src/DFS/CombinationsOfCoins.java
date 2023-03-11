package DFS;

import java.util.ArrayList;
import java.util.List;

public class CombinationsOfCoins {
    public List<List<Integer>> combinations(int target, int[] coins) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        combinations(res, cur, coins, target, 0);
        return res;
    }

    private void combinations(List<List<Integer>> res, List<Integer> cur, int[] coins, int remain, int index) {
        if (index == coins.length - 1) {
            if (remain % coins[index] == 0) {
                cur.add(remain / coins[index]);
                res.add(new ArrayList<>(cur));
                cur.remove(cur.size() - 1);
            }
            return;
        }

        for (int i = remain / coins[index]; i >= 0; i--) {
            cur.add(i);
            combinations(res, cur, coins, remain - i * coins[index], index + 1);
            cur.remove(cur.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> res = new CombinationsOfCoins().combinations(99, new int[]{25, 10, 5, 1});
        for (List<Integer> list : res) {
            System.out.println(list);
        }
    }
}
