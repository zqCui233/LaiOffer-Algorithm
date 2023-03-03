package HeapAndGraphSearchI;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KSmallestInUnsortedArray {
    public int[] kSmallest(int[] array, int k) {
        if (array.length == 0 || k == 0) return new int[0];
        int[] res = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1.equals(o2)) return 0;
                return o1 > o2 ? -1 : 1;
            }
        });

        for (int i = 0; i < array.length; i++) {
            if (i < k) pq.offer(array[i]);
            else if (array[i] < pq.peek()){
                pq.poll();
                pq.offer(array[i]);
            }
        }

        for (int i = k - 1; i >=0; i--) {
            res[i] = pq.poll();
        }
        return res;
    }
}
