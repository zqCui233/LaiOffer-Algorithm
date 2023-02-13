package RecursionIAndSorting;

public class FibonacciNumberLite {
    public int fibonacci(int k) {
        if (k <= 0) return 0;
        else if (k == 1) return 1;
        return fibonacci(k - 1) + fibonacci(k - 2);
    }
}
