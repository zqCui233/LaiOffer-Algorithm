package HashTableAndStringI;

import java.util.ArrayList;
import java.util.List;

public class CommonNumbersOfTwoSortedArraysArrayVersion {
    public List<Integer> common(int[] A, int[] B) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0, j = 0; i < A.length && j < B.length;) {
            if (A[i] == B[j]) {
                res.add(A[i]);
                i++;
                j++;
            } else if (A[i] < B[j]) i++;
            else j++;
        }

        return res;
    }
}
