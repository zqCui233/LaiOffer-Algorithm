package DPI;

public class MaxProductOfCuttingRope {
    public int maxProduct(int length) {
        int[] m = new int[length + 1];
        m[1] = 0;

        for (int i = 2; i <= length; i++) {
            for (int j = i + 1; j <= i / 2; j++) {
                m[i] = Math.max(m[i], Math.max(j, m[j]) * Math.max(i - j, m[i - j]));
            }
        }

        return m[length];
    }
}
