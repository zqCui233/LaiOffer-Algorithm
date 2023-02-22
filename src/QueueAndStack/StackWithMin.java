package QueueAndStack;

import java.util.Deque;
import java.util.LinkedList;

public class StackWithMin {
    private Deque<Integer> stack;
    private Deque<Integer> min;
    private Deque<Integer> size;

    public StackWithMin() {
        this.stack = new LinkedList<>();
        this.min = new LinkedList<>();
        this.size = new LinkedList<>();
    }

    public int pop() {
        if (stack.isEmpty()) return -1;
        if (stack.peekFirst().equals(min.peekFirst()) && stack.size() == size.peekFirst() ) {
            min.pollFirst();
            size.pollFirst();
        }
        return stack.pollFirst();
    }

    public void push(int element) {
        stack.offerFirst(element);

        if (min.isEmpty() || element < min.peekFirst()) {
            min.offerFirst(element);
            size.offerFirst(stack.size());
        }
    }

    public int top() {
        if (stack.isEmpty()) return -1;
        return stack.peekFirst();
    }

    public int min() {
        if (min.isEmpty()) return -1;
        return min.peekFirst();
    }

//    push(136),min(),push(135),push(139),top(),min(),pop(),min(),top(),min(),pop(),min()
    public static void main(String[] args) {
        StackWithMin stack = new StackWithMin();
        stack.push(136);
        System.out.println(stack.min());
        stack.push(135);
        stack.push(139);
        System.out.println(stack.top());
        System.out.println(stack.min());
        System.out.println(stack.pop());
        System.out.println(stack.min());
        System.out.println(stack.top());
        System.out.println(stack.min());
        System.out.println(stack.pop());
        System.out.println(stack.min());

    }
}
