public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms
        int a = 0, b = 1, next;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}
