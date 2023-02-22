package QueueAndStack;

import java.util.Deque;
import java.util.LinkedList;

public class QueueBy2Stacks {
    private Deque<Integer> s1;
    private Deque<Integer> s2;
    public QueueBy2Stacks() {
        this.s1 = new LinkedList<>();
        this.s2 = new LinkedList<>();
    }

    public Integer poll() {
        if (isEmpty()) return null;
        move(s1, s2);
        return s2.pollFirst();
    }

    public void offer(int element) {
        s1.offerFirst(element);
    }

    public Integer peek() {
        if (isEmpty()) return null;
        move(s1, s2);
        return s2.peekFirst();
    }

    public int size() {
        return s1.size() + s2.size();
    }

    public boolean isEmpty() {
        return  s1.isEmpty() && s2.isEmpty();
    }

    private void move(Deque<Integer> src, Deque<Integer> out) {
        if (!out.isEmpty()) return;
        while (!src.isEmpty()) out.offerFirst(src.pollFirst());
    }
}
