import java.util.*;
class Area{
    double r, pi = 3.14;
    void getArea(double radius) {
        r = radius;
    }
    void area() {
        System.out.println("Area of Sphere: " + (4 * pi * r * r));
    }

}

class Volume extends Area{
    double r, pi = 3.14;
    void getVolume(double radius) {
        r = radius;
    }
    void volume() {
        System.out.println("Volume of Sphere: " + (4 * pi * r * r * r));
    }
}
public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Volume v = new Volume();
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        v.getArea(radius);
        v.getVolume(radius);
        v.area();
        v.volume();
        sc.close();
    }
}