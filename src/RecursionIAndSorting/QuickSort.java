package RecursionIAndSorting;

import Util.Utils;

public class QuickSort {
    public int[] quickSort(int[] array) {
        if (array == null || array.length == 0) return array;
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int left, int right) {
        if (left >= right) return;
        int mid = partition(array, left, right);
        quickSort(array, left, mid - 1);
        quickSort(array, mid + 1, right);
    }

    private int partition(int[] array, int left, int right) {
        int l = left, r = right - 1;
        while (l <= r) {
            if (array[l] < array[right]) l++;
            else if (array[r] >= array[right]) r--;
            else Utils.swap(array, l++, r--);
        }
        Utils.swap(array, l, right);
        return l;
    }

}
