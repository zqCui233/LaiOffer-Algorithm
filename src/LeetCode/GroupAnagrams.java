package LeetCode;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs == null) return res;
        Map<String, List> map = new HashMap<>();

        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder();
            for (int num : count) {
                sb.append(num);
                sb.append('%');
            }
            String key = String.valueOf(sb);
            if (!map.containsKey(key)) map.put(key, new ArrayList());
            map.get(key).add(s);
        }

        for (String key: map.keySet()) {
            res.add(map.get(key));
        }

        return res;
    }
}
