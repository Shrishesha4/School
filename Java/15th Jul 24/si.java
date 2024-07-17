import java.util.*;
public class si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle: ");
        double p = sc.nextDouble();
        System.out.println("Enter Rate: ");
        double r = sc.nextDouble();
        System.out.println("Enter Time: ");
        double t = sc.nextDouble();
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest is " + si);
        sc.close();
    }
}
