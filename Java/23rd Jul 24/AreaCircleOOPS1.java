import java.util.*;
public class AreaCircleOOPS1 {
    class Area {
        double pi = 3.14;
        double radius;
        double area;

        public void getRad() { 
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter radius: ");
            radius = sc.nextDouble();
            sc.close();
        }
        public void getArea() {
            area = pi * radius * radius;
        }
    }

    public static void main(String[] args) {    
        AreaCircleOOPS1 obj = new AreaCircleOOPS1();
        Area obj1 = obj.new Area();
        obj1.getRad();
        obj1.getArea();
        System.out.println("The area of the circle is: " + obj1.area);
    }    
}
