package DFS;

import Util.Utils;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationsI {
    public List<String> permutations(String input) {
        List<String> res = new ArrayList<>();
        permutations(input.toCharArray(), 0, res);
        return res;
    }

    private void permutations(char[] array, int index, List<String> res) {
        if (index == array.length) {
            res.add(new String(array));
            return;
        }

        for (int i = index; i < array.length; i++) {
            Utils.swap(array, i, index);
            permutations(array, index + 1, res);
            Utils.swap(array, i, index);
        }
    }

}
