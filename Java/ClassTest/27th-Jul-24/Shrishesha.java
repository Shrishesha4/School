/*  Method overloading concept to print the multiplication table of 11 and 13 */
import java.util.*;
class Shrishesha{
    void printTable(int number) {
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println();
    }

    static int[] tables = new int[2];

    void printTable(int[] numbers) {
        for (int i = 0; i < tables.length; i++) {
            printTable(tables[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shrishesha mt = new Shrishesha();
        
        for (int i = 0; i < tables.length; i++) {
            System.out.println("Enter two tables to print:");
            tables[i] = sc.nextInt();
        }
        sc.close();
        mt.printTable(tables);
    }
}