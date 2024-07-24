import java.util.*;
public class AreaCircleOOPS2 {
    class Area {
        double pi = 3.14;
        double radius;
        double area;

        public void getArea(double radius) {
            area = pi * radius * radius;
        }
    }

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        AreaCircleOOPS2 obj = new AreaCircleOOPS2();
        Area obj1 = obj.new Area();
        System.out.println("Enter radius: ");
        double rad = sc.nextInt();
        obj1.getArea(rad);
        System.out.println("The area of the circle is: " + obj1.area);
        sc.close();
    }    
}
