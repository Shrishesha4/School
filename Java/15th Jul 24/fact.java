import java.util.*;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + "using for loop is " + fact);

        int i = 1;
        while (i <= n) {
        fact = fact * i;
        i++;
        }
        System.out.println("\nFactorial of " + n + "using while loop is " + fact);

        int j = 1;
        do {
        fact = fact * j;
        j++;
        } while (i <= n);
        System.out.println("\nFactorial of " + n + "using do-while loop is " + fact);
        sc.close();
    }
}
