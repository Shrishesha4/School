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
        System.out.println("\nSum of series upto " + n + " terms using for loop: " + sum);
        int x = 0;
        while (x < n) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            sum = sum + n3;
            n1 = n2;
            n2 = n3;
            i++;
        }
        System.out.println("\nSum of series upto " + n + " terms using while loop: " + sum);
        int j = 0;
        do {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            sum = sum + n3;
            n1 = n2;
            n2 = n3;
            j++;
        } while (j < n);
        System.out.println("\nSum of series upto " + n + " terms using do-while loop: " + sum);
    }
}
