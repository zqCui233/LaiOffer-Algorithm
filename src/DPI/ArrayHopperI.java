package DPI;

public class ArrayHopperI {
    public boolean canJump(int[] array) {
        boolean[] m = new boolean[array.length];
        m[0] = true;

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (m[j] && array[j] >= i - j) {
                    m[i] = true;
                    break;
                }
            }
        }

        return m[array.length - 1];
    }


    public boolean canJumpII(int[] array) {
        if (array.length == 1) return true;
        boolean[] m = new boolean[array.length];
        m[array.length - 1] = true;

        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] + i >= array.length - 1) {
                m[i] = true;
                continue;
            }
            for (int j = array[i]; j >= 1; j--) {
                if (m[j + i]) {
                    m[i] = true;
                    break;
                }
            }
        }

        return m[0];
    }
}