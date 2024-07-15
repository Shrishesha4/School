import java.util.*;
public class mulTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Multiplication table of " + n + "using for loop is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        System.out.println("Multiplication table of " + n + "using while loop is: ");
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + n * i);
            i++;
        }
        System.out.println("Multiplication table of " + n + "using do-while loop is: ");
        int j = 1;
        do {
            System.out.println(n + " x " + j + " = " + n * i);
            j++;
        } while (i <= 10);
        sc.close();
        }
}
