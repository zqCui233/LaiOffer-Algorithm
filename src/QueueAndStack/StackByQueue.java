package QueueAndStack;

import java.util.LinkedList;
import java.util.Queue;

public class StackByQueue {
    private Queue<Integer> queue;
    public StackByQueue() {
        this.queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public Integer pop() {
        if (isEmpty()) return null;
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) queue.offer(queue.poll());
        return queue.poll();
    }

    /** Get the top element. */
    public Integer top() {
        if (isEmpty()) return null;
        int res = pop();
        queue.offer(res);
        return res;
    }

    /** Returns whether the stack is empty. */
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
