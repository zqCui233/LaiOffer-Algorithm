package BinarySearch;

public class SearchInShiftedSortedArrayI {
    public int search(int[] array, int target) {
        if (array == null || array.length == 0) return -1;
        int left = 0, right = array.length - 1;
        int pivot = array[0];

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) return mid;
            else if (array[mid] >= pivot) {
                if (array[left] <= target && target < array[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (target > array[mid] && target <= array[right]) left = mid + 1;
                else right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,2};
        int res = new SearchInShiftedSortedArrayI().search(input, 1);
        System.out.println(res);
    }
}
