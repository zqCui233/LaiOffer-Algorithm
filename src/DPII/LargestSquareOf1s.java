package DPII;

public class LargestSquareOf1s {
    public int largest(int[][] matrix) {
        int N = matrix.length, res = 0;
        int[][] m = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i * j == 0) m[i][j] = matrix[i][j];
                else if (matrix[i][j] == 1) {
                    m[i][j] = Math.min(m[i - 1][j] + 1, m[i][j - 1] + 1);
                    m[i][j] = Math.min(m[i - 1][j - 1] + 1, m[i][j]);
                }
                res = Math.max(res, m[i][j]);
            }
        }

        return res;
    }
}
