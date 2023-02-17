package BinarySearch;

public class TotalOccurrence {
    public int totalOccurrence(int[] array, int target) {
        if (array == null || array.length == 0) return 0;
        int l = new FirstOccurrence().firstOccur(array, target);
        if (l == -1) return 0;
        int r = new LastOccurrence().lastOccur(array, target);
        return r - l + 1;
    }

}
