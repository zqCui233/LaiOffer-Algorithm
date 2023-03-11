package DFS;

import java.util.ArrayList;
import java.util.List;

public class AllSubsetsI {
    public List<String> subSets(String set) {
        List<String> res = new ArrayList<>();
        if (set == null) return res;
        StringBuilder sb = new StringBuilder();
        subSets(set.toCharArray(), res, sb, 0);
        return res;
    }

    private void subSets(char[] array, List<String> res, StringBuilder sb, int index) {
        if (index == array.length) {
            res.add(sb.toString());
            return;
        }

        sb.append(array[index]);
        subSets(array, res, sb, index + 1);
        sb.deleteCharAt(sb.length() - 1);
        subSets(array, res, sb, index + 1);
    }

    public static void main(String[] args) {
        String string = "abc";
        List<String> list = new AllSubsetsI().subSets(string);
        System.out.println(list);
    }
}
