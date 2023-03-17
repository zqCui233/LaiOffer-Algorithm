package StringII;

import Util.Utils;

public class ReverseString {
    public String reverse(String input) {
        char[] array = input.toCharArray();

        int i = 0, j = array.length - 1;
        while (i < j) {
            Utils.swap(array, i++, j--);
        }

        return new String(array);
    }
}
