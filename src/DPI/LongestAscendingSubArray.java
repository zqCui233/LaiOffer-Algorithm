package DPI;

public class LongestAscendingSubArray {
    public int longest(int[] array) {
        if (array.length == 0) return 0;
        int res = 1;
        int m[] = new int[array.length];
        m[0]  = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                m[i] = m[i - 1] + 1;
                res = Math.max(m[i], res);
            } else m[i] = 0;
        }

        return res;
    }
}
