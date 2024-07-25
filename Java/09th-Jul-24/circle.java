import java.util.*;
public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, r;
        System.out.println("Enter Radius: ");
        r = sc.nextDouble();
        area = 3.14 * r * r;
        System.out.println("area of circle is " + area);
        sc.close();
    }
}
