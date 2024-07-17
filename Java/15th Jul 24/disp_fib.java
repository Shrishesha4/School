import java.util.*;
public class disp_fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1 = 0, n2 = 1, n3, i;
        n = sc.nextInt();
        sc.close();
        System.out.print("Using For Loops:");
        System.out.print(n1 + " " + n2);
        for (i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.print("\nUsing While Loops:");
        System.out.print(n1 + " " + n2);
        int x = 2;
        while (x < n) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            i++;
        }
        System.out.print("\nUsing Do-While Loops:");
        System.out.print(n1 + " " + n2);
        int j = 2;
        do {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            j++;
        } while (j < n);
        
    }
}
