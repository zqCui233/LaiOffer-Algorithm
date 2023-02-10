package BinarySearch;

public class SearchInShiftedSortedArrayI {
    public int search(int[] array, int target) {
        if (array == null || array.length == 0) return -1;
        int right = findMax(array);
        System.out.println("max: " + right);
        int left;
        if (array[0] <= target) {
            left = 0;
        }
        else {
            left = plus(array, right);
            right = array.length - 1;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) return mid;
            else if (array[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    private int plus(int[] array, int i) {
        if (i == array.length - 1) return 0;
        return i + 1;
    }

    private int findMax(int[] array) {
        if (array.length == 1) return 0;
        int left = 0, right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] > array[mid + 1]) return mid;
            else {
                if (array[mid] > array[left]) left = mid;
                else right = mid;
            }
        }
        return array[left] > array[right] ? left : right;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,2};
        int res = new SearchInShiftedSortedArrayI().search(input, 1);
        System.out.println(res);
    }
}
