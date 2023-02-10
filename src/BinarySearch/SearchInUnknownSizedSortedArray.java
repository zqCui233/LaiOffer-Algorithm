package BinarySearch;

import java.util.Dictionary;

public class SearchInUnknownSizedSortedArray {
    Dictionary<Integer, Integer> dict;
    public int search(int target) {
        if (dict.get(0) == null) return -1;
        else if (dict.get(0) == target) return 0;

        int i = 1;
        while (dict.get(i) != null && dict.get(i) < target) i *= 2;

        int left = i / 2, right = i;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dict.get(mid) == null || dict.get(mid) > target) right = mid - 1;
            else if (dict.get(mid) == target) return mid;
            else left = mid + 1;
        }

        return -1;
    }
}
