package StringII;

import Util.Utils;

public class RightShiftByNCharacters {
    public String rightShift(String input, int n) {
        if (input == null || input.length() <= 1) return input;
        n %= input.length();
        char[] array = input.toCharArray();
//        Utils.reverse(array, 0, array.length - 1);
        Utils.reverse(array, 0, array.length - n - 1);
        Utils.reverse(array, array.length - n, array.length - 1);
        Utils.reverse(array, 0, array.length - 1);
        return new String(array);
    }
}
