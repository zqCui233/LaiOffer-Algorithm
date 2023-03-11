package HashTableAndStringI;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {
    public String[] topKFrequent(String[] combo, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s: combo) map.put(s, map.getOrDefault(s, 0) + 1);
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (pq.size() < k) pq.offer(entry);
            else if (entry.getValue() > pq.peek().getValue()) {
                pq.poll();
                pq.offer(entry);
            }
        }

        String[] res = new String[pq.size()];
        for (int i = pq.size() - 1; i >= 0; i--) res[i] = pq.poll().getKey();

        return res;
    }
}
