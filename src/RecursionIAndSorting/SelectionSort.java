package RecursionIAndSorting;

import java.util.Arrays;
import Util.Utils;

public class SelectionSort {
    public int[] solve(int[] array) {
        if (array == null || array.length == 0) return array;

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) min = j;
            }
            Utils.swap(array, i, min);
        }

        return array;
    }

    public static void main(String[] args) {
        int[] input = new int[]{4,2,5,1,-4,8};
        int[] res = new SelectionSort().solve(input);
        System.out.println(Arrays.toString(res));
    }
}
