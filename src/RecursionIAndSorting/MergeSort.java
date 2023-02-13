package RecursionIAndSorting;

import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[] array) {
        if (array == null || array.length == 0) return array;
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length - 1);
        return array;
    }

    private void mergeSort(int[] array, int[] helper, int left, int right) {
        if (left == right) return;

        int mid = left + (right - left) / 2;
        mergeSort(array, helper, left, mid);
        mergeSort(array, helper, mid + 1, right);
        merge(array, helper, left, right, mid);
    }

    private void merge(int[] array, int[] helper, int left, int right, int mid) {
        for (int i = left; i <= right; i++) helper[i] = array[i];

        int l = left, r = mid + 1;
        while (l <= mid && r <= right) {
            if (helper[l] <= helper[r]) array[left++] = helper[l++];
            else array[left++] = helper[r++];
        }

        while (l <= mid) array[left++] = helper[l++];
        while (r <= right) array[left++] = helper[r++];
    }

    public static void main(String[] args) {
        int[] input = new int[]{5,2,7,4,1,3,6,8};
        new MergeSort().mergeSort(input);
        System.out.println(Arrays.toString(input));
    }
}
