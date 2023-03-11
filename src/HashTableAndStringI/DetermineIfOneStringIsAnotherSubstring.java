package HashTableAndStringI;

public class DetermineIfOneStringIsAnotherSubstring {
    private final int d = 128;
    private final int q = 31;
    public int strstr(String T, String P) {
        if (P.length() == 0) return 0;
        if (P.length() > T.length()) return -1;

        int pHash = 0;
        int tHash = 0;
        int h = 1; // h = d ^ (m - 1)

        for (int i = 0; i < P.length() - 1; i++) h = h * d % q;

        for (int i = 0; i < P.length(); i++) {
            pHash = (d * pHash + P.charAt(i)) % q;
            tHash = (d * tHash + T.charAt(i)) % q;
        }

        if (pHash == tHash && strEquals(T, 0, P)) return 0;

        // search
        for (int i = 1; i <= T.length() - P.length(); i++) {
            tHash = nonNegative(tHash - h * T.charAt(i - 1) % q);
            tHash = nextHash(tHash, T.charAt(i + P.length() - 1));
            if (pHash == tHash && strEquals(T, i, P)) return i;
        }

        return -1;
    }

    private boolean strEquals(String T, int start, String P) {
        for (int i = 0; i < P.length(); i++) {
            if (P.charAt(i) != T.charAt(start + i)) return false;
        }

        return true;
    }

    private int nonNegative(int a) {
        if (a < 0) {
            a += q;
        }
        return a;
    }

    private int nextHash(int preHash, int addition) {
        return (preHash * d % q + addition) % q;
    }
}
