package DPII;

import java.util.HashSet;
import java.util.Set;

public class DictionaryWordI {
    public boolean canBreak(String input, String[] dict) {
        Set<String> set = new HashSet<>();
        for (String s : dict) set.add(s);

        char[] array = input.toCharArray();
        boolean[] m = new boolean[array.length + 1];
        m[0] = true;

        for (int i = 1; i < m.length; i++) {
            for (int j = 0; j < i; j++) {
                if (m[j] && set.contains(new String(array, j, i - j))) {
//                    System.out.println(new String(array, j, i - j));
                    m[i] = true;
                    break;
                }
            }
        }

        return m[array.length];
    }

    public static void main(String[] args) {
        String input = "robcatbob";
        String[] dict = new String[]{"rob","cat","bob"};
        System.out.println(new DictionaryWordI().canBreak(input, dict));
    }
}
