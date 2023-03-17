package StringII;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int longest(String input) {
        if (input.isEmpty()) return 0;
        char[] array = input.toCharArray();
        Set<Character> set = new HashSet<>();
        int res = Integer.MIN_VALUE;
        int i = 0, j = 0;
        while (j < array.length) {
            if (!set.contains(array[j])) {
                set.add(array[j++]);
                System.out.println(j + "  " + i);
                res = Math.max(res, j - i);
            } else {
                while (set.contains(array[j])) {
                    set.remove(array[i]);
                    i++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "abcdefasd";
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().longest(s));
    }
}
