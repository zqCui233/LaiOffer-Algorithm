package StringII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAnagrams {
    public List<Integer> allAnagrams(String sh, String lo) {
        List<Integer> res = new ArrayList<>();
        if (lo.isEmpty() || lo.length() < sh.length()) return res;
        Map<Character, Integer> map = new HashMap<>();
        int alreadyMatch = 0;
        for (char c : sh.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < lo.length(); i++) {
            char cur = lo.charAt(i);
            Integer count = map.get(cur);
            if (count != null) {
                if (count == 1) alreadyMatch++;
                map.put(cur, count - 1);
            }

            if (i >= sh.length()) {
                cur = lo.charAt(i - sh.length());
                count = map.get(cur);
                if (count != null) {
                    if (count == 0) alreadyMatch--;
                    map.put(cur, count + 1);
                }
            }

            if (alreadyMatch == map.size()) res.add(i - sh.length() + 1);
        }

        return res;
    }

}
