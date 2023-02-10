package BinarySearch;

import java.util.Arrays;

public class KClosestInSortedArray {
    public int[] kClosest(int[] array, int target, int k) {
        if (array.length == 0 || k == 0) return new int[]{};
        int size = k;
        int[] res = new int[k];

        int closest = closest(array, target);
        int left = closest, right = closest + 1;
        int i = 0;
        while (left >= 0 && right <= array.length - 1 && k > 0) {
            if (Math.abs(array[left] - target) <= Math.abs(array[right] - target))
                res[i++] = array[left--];
            else
                res[i++] = array[right++];
            k--;
        }

        while (left >= 0 && i < size) res[i++] = array[left--];

        while (right <= array.length - 1 && i < size) res[i++] = array[right++];

        return res;
    }

    private int closest(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) return mid;
            else if (array[mid] < target) left = mid;
            else right = mid;
        }
        return Math.abs(array[left] - target) <= Math.abs(array[right] - target) ? left : right;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,4,6,8};
        int[] res = new KClosestInSortedArray().kClosest(input, 3, 3);
        System.out.println(Arrays.toString(res));
    }
}
