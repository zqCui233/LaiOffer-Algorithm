package QueueAndStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SortWith2Stacks {
    public void sort(LinkedList<Integer> s1) {
        if (s1.size() <= 1) return;
        LinkedList<Integer> s2 = new LinkedList<>();

        while (!s1.isEmpty()) {
            int globalMin = Integer.MAX_VALUE;
            int count = 0;
            while (!s1.isEmpty()) {
                int cur = s1.pollFirst();
                if (cur < globalMin) {
                    globalMin = cur;
                    count = 1;
                } else if (cur == globalMin) count++;
                s2.offerFirst(cur);
            }

            while (!s2.isEmpty() && s2.peekFirst() >= globalMin) {
                int cur = s2.pollFirst();
                if (cur != globalMin) s1.offerFirst(cur);
            }

            while (count-- > 0) s2.offerFirst(globalMin);
        }

        while (!s2.isEmpty()) s1.offerFirst(s2.pollFirst());
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{3,5,1,3,-1,5,3,-6};
        LinkedList<Integer> s1 = new LinkedList<>(Arrays.asList(array));

        System.out.println("Before:");
        System.out.println(s1);
        new SortWith2Stacks().sort(s1);
        System.out.println("After:");
        System.out.println(s1);
    }
}
