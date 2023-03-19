package DPI;

public class FibonacciNumber {
    public long fibonacci(int K) {
        long a = 0, b = 1;
        if (K <= 0) return a;
        if (K == 1) return b;
        long res = 0;
        for (int i = 2; i <= K; i++) {
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new FibonacciNumber().fibonacci(9));
    }
}
