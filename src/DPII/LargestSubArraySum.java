package DPII;

public class LargestSubArraySum {
    public int largestSum(int[] array) {
        int[] m = new int[array.length];
        m[0] = array[0];
        int res = m[0];

        for (int i = 1; i < array.length; i++) {
            if (m[i - 1] < 0) {
                m[i] = array[i];
            } else {
                m[i] = array[i] + m[i - 1];
            }
            res = Math.max(res, m[i]);
        }

        return res;
    }
}
