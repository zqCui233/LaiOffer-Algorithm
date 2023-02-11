package BinarySearch;

public class SearchInShiftedSortedArrayII {
    public int search(int[] array, int target) {
        if (array == null || array.length == 0) return -1;

        int left = 0, right = array.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (array[left] == target) right = left;
            else if (array[mid] == target) right = mid;
            else if (array[left] < array[mid] || array[mid] > array[right]) {
                if (array[left] <= target && target < array[mid]) right = mid - 1;
                else left = mid + 1;
            } else if (array[left] > array[mid] || array[mid] < array[right]) {
                if (array[mid] < target && target <= array[right]) left = mid + 1;
                else right = mid - 1;
            } else right--;
        }

        return array[left] == target ? left : -1;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,1,1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int res = new SearchInShiftedSortedArrayII().search(input, 2);
        System.out.println(res);
    }
}
