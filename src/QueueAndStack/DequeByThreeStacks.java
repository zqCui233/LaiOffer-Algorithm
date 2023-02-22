package QueueAndStack;

import java.util.Deque;
import java.util.LinkedList;

public class DequeByThreeStacks {
    private Deque<Integer> first;
    private Deque<Integer> last;
    private Deque<Integer> buffer;
    public DequeByThreeStacks() {
        this.first = new LinkedList<>();
        this.last = new LinkedList<>();
        this.buffer = new LinkedList<>();
    }

    public void offerFirst(int element) {
        first.offerFirst(element);
    }

    public void offerLast(int element) {
        last.offerFirst(element);
    }

    public Integer pollFirst() {
        if (isEmpty()) return null;
        moveHalf(last, first);
        return first.pollFirst();
    }

    public Integer pollLast() {
        if (isEmpty()) return null;
        moveHalf(first, last);
        return last.pollFirst();
    }

    public Integer peekFirst() {
        if (isEmpty()) return null;
        moveHalf(last, first);
        return first.peekFirst();
    }

    public Integer peekLast() {
        if (isEmpty()) return null;
        moveHalf(first, last);
        return last.peekFirst();
    }

    public int size() {
        return first.size() + last.size();
    }

    public boolean isEmpty() {
        return first.isEmpty() && last.isEmpty();
    }

    private void moveHalf(Deque<Integer> src, Deque<Integer> out) {
        if (!out.isEmpty()) return;
        int size = src.size() / 2;
        for (int i = 0; i < size; i++) buffer.offerFirst(src.pollFirst());
        while (!src.isEmpty()) out.offerFirst(src.pollFirst());
        while (!buffer.isEmpty()) src.offerFirst(buffer.pollFirst());
    }
}
