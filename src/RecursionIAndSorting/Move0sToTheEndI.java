package RecursionIAndSorting;

import Util.Utils;

public class Move0sToTheEndI {
    public int[] moveZero(int[] array) {
        if (array == null || array.length == 0) return array;

        int i = 0, j = array.length - 1;

        while (i <= j) {
            if (array[j] == 0) j--;
            else if (array[i] != 0) i++;
            else Utils.swap(array, i++, j--);
        }

        return array;
    }
}
