import java.util.Scanner;

public class itom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inches = sc.nextDouble();

        double meters = inches * 0.0254;

        System.out.println(inches + " inches is " + meters + " meters");

        sc.close();
    }
}
