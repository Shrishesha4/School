import java.util.*;
public class tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, b, h;
        System.out.println("Enter Base: ");
        b = sc.nextDouble();
        System.out.println("Enter Height: ");
        h = sc.nextDouble();
        area = 0.5 * b * h;
        System.out.println("Area of triangle is " + area);
        sc.close();
    }
}
