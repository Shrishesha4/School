import java.util.*;
public class sumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1 = 0, n2 = 1, n3, i, sum = 0;
        System.out.print("Enter the number of terms: ");
        n = sc.nextInt();
        sc.close();
        System.out.print(n1 + " " + n2);
        for (i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            sum = sum + n3;
            n1 = n2;
            n2 = n3;
        }
        System.out.println("\nSum of series upto " + n + " terms: " + sum);
    }
}
