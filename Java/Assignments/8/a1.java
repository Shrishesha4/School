import java.util.*;
class Rect{
    double a;
    Rect(double x, double y, double z){
        a = (x*y*z);
    }

    void display(){
        System.out.println("Area of the rectangle is: " + a);
    }
}
public class a1 {
    public static void main(String[] args) {
        double length, breadth, height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        breadth = sc.nextDouble();
        System.out.print("Enter the height: ");
        height = sc.nextDouble();
        Rect obj = new Rect(length, breadth, height);
        obj.display();
        sc.close();
    }

}
