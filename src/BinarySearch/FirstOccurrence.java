package BinarySearch;

public class FirstOccurrence {
    public int firstOccur(int[] array, int target) {
        if (array == null || array.length == 0) return -1;
        int left = 0, right = array.length - 1;

        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) right = mid;
            else if (array[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        if (array[left] == target) return left;
        else if (array[right] == target) return right;
        return -1;
    }
}
