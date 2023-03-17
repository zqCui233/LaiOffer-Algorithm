package HashTableAndStringI;

import java.util.HashSet;
import java.util.Set;

public class RemoveCertainCharacters {
    public String remove(String input, String t) {
        Set<Character> set = new HashSet<>();
        char[] array = input.toCharArray();
        for (char c : t.toCharArray()) set.add(c);
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (!set.contains(array[i])) {
                array[j++] = array[i];
            }
        }

        return new String(array, 0, j);
    }
}
