package RecursionIAndSorting;

import Util.Utils;

import java.util.Arrays;

public class RainbowSort {
    public int[] rainbowSort(int[] array) {
        if (array.length == 0) return array;

        int i = 0, j = 0, k = array.length - 1;

        while (j <= k) {
            if (array[i] == -1) {
                i++;
                j++;
            } else if (array[k] == 1) k--;
            else if (array[j] == 0) j++;
            else if (array[j] == -1) Utils.swap(array, i++, j++);
            else Utils.swap(array, j, k--);
        }

        return array;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 0, 1, -1, 0};
        int[] res = new RainbowSort().rainbowSort(input);
        System.out.println(Arrays.toString(res));
    }
}
