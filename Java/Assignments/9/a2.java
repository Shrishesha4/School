// method overloading concept to print the multiplication table of 3, 7, 9 tables
import java.util.*;
public class a2 {

    void printTable(int number) {
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println();
    }

    void printTable(int[] numbers) {
        for (int number : numbers) {
            printTable(number);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        a2 mt = new a2();
        
        int[] tables = new int[3];
        for (int i = 0; i < tables.length; i++) {
            System.out.println("Enter three tables to print:");
            tables[i] = sc.nextInt();
        }
        
        sc.close();
        mt.printTable(tables);
    }
}
