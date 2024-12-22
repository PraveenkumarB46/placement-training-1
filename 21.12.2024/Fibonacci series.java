import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();
        int n1 = 0, n2 = 1;
        System.out.print("Fibonacci Series: " + n1 + " " + n2);
        for (int i = 3; i <= terms; i++) {
            int nextTerm = n1 + n2;
            System.out.print(" " + nextTerm);
            n1 = n2;
            n2 = nextTerm;
        }
    }
}
