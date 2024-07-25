import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = sc.nextDouble();

        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double fourthPower = Math.pow(number, 4);

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth Power: " + fourthPower);

        sc.close();
    }
}
