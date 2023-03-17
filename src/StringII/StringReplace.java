package StringII;

import java.util.ArrayList;
import java.util.List;

public class StringReplace {
    public String replace(String input, String source, String target) {
        char[] array = input.toCharArray();
        if (source.length() >= target.length()) return replaceShort(array, source, target);
        return replaceLong(array, source, target);
    }

    private String replaceShort(char[] array, String source, String target) {
        int i = 0, j = 0;
        while (j < array.length) {
            if (j <= array.length - source.length() && isSubString(array, source, j)) {
                copyString(array, target, i);
                i += target.length();
                j += source.length();
            } else {
                array[i++] = array[j++];
            }
        }
        return new String(array, 0, i);
    }

    private String replaceLong(char[] array, String source, String target) {
        List<Integer> matches = getAllIndex(array, source);
        char[] res = new char[array.length + (target.length() - source.length()) * matches.size()];
        int i = res.length - 1;
        int j = array.length - 1;
        int k = matches.size() - 1;

        while (j >= 0) {
            if (k >= 0 && j == matches.get(k)) {
                copyString(res, target, i - target.length() + 1);
                k--;
                i -= target.length();
                j -= source.length();
            } else res[i--] = array[j--];
        }

        return new String(res);
    }

    private boolean isSubString(char[] array, String source, int i) {
        for (int j = 0; j < source.length(); j++) {
            if (array[i + j] != source.charAt(j)) return false;
        }
        return true;
    }

    private void copyString(char[] array, String target, int i) {
        for (int j = 0; j < target.length(); j++) {
            array[i + j] = target.charAt(j);
        }
    }

    private List<Integer> getAllIndex(char[] array, String source) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= array.length - source.length();) {
            if (isSubString(array, source, i)) {
                res.add(i + source.length() - 1);
                i += source.length();
            } else i++;
        }
        return res;
    }
}
