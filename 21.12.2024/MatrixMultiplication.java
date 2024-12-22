import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns of matrix A: ");
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] A = new int[m][n];
        System.out.println("Enter elements of matrix A: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter number of rows and columns of matrix B: ");
        int p = sc.nextInt(), q = sc.nextInt();
        if (n != p) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }
        int[][] B = new int[p][q];
        System.out.println("Enter elements of matrix B: ");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        int[][] result = new int[m][q];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Resultant matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
