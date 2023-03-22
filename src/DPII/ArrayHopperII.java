package DPII;

import java.util.Arrays;

public class ArrayHopperII {
    public int minJump(int[] array) {
        int m[] = new int[array.length];
        m[array.length - 1] = 0;
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] + i >= array.length - 1) m[i] = 1;
            else {
                int minJump = Integer.MAX_VALUE;
                for (int j = i + 1; j < array.length - 1; j++) {
                    if (m[j] == -1) continue;
                    else if (array[i] + i >= j) {
                        minJump = Math.min(minJump, m[j] + 1);
                    }
                }
                if (minJump == Integer.MAX_VALUE) m[i] = -1;
                else m[i] = minJump;
            }
        }
        return m[0];
    }

}
