package BinarySearch;

public class SearchInSortedMatrixI {
    public int[] search(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[]{-1, -1};
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int m = mid / matrix[0].length;
            int n = mid % matrix[0].length;
            if (matrix[m][n] == target) return new int[]{m, n};
            else if (matrix[m][n] < target) left = mid + 1;
            else right = mid - 1;
        }
        return new int[]{-1, -1};
    }
}
