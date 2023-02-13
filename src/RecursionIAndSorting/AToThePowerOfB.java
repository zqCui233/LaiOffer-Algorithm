package RecursionIAndSorting;

public class AToThePowerOfB {
    public long power(int a, int b) {
        if (b == 0) return 1;
        if (a == 0) return 0;
        long half = power(a, b / 2);
        if (b % 2 == 0) return half * half;
        return a * half * half;
    }
}
