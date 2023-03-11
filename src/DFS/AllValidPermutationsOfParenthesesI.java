package DFS;

import java.util.ArrayList;
import java.util.List;

public class AllValidPermutationsOfParenthesesI {
    public List<String> validParentheses(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        validParentheses(res, sb, n, n);
        return res;
    }

    private void validParentheses(List<String> res, StringBuilder sb, int leftRemain, int rightRemain) {
        if (leftRemain == 0 && rightRemain == 0) {
            res.add(sb.toString());
            return;
        }

        if (leftRemain > 0) {
            sb.append('(');
            validParentheses(res, sb, leftRemain - 1, rightRemain);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (rightRemain > 0 && rightRemain > leftRemain) {
            sb.append(')');
            validParentheses(res, sb, leftRemain, rightRemain - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        List<String> res = new AllValidPermutationsOfParenthesesI().validParentheses(3);
        System.out.println(res);
    }
}
