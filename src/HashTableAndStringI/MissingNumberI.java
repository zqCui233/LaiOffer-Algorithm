package HashTableAndStringI;

public class MissingNumberI {
    public int missing(int[] array) {
        int res = 0;
        for (int i = 0; i <= array.length + 1; i++) res ^= i;
        for (int x : array) res ^= x;
        return res;
    }
}
