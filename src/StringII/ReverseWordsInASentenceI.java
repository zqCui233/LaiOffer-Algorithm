package StringII;

import Util.Utils;

public class ReverseWordsInASentenceI {
    public String reverseWords(String input) {
        if (input == null) return null;
        char[] array = input.toCharArray();

        Utils.reverse(array, 0, array.length - 1);
        int left = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i - 1] == ' ') left = i;
            if (i == array.length - 1 || array[i + 1] == ' ') Utils.reverse(array, left, i);
        }

        return new String(array);
    }
}
