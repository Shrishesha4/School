import java.util.*;

public class matrixMul {
    public static void main(String[] args) {
        int n = 2;
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];
        int i, j, k;
        System.out.println("Enter elements of first matrix: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                c[i][j] = 0;
                for (k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}