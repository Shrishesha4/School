import java.util.*;
class area{
    double Ar(int a){
        return a * a;
    }
    double Ar(int l, int b){
        return l * b;
    }
    double Ar(double r){
        return 3.14 * r * r;
    }
}

public class areas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        area obj = new area();
        System.out.println("Enter Side of Square: ");
        int x = sc.nextInt();
        System.out.println("Area of Square: " + obj.Ar(x));
        System.out.println("Enter Length and Breadth of Rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of Rectangle: " + obj.Ar(l, b));
        System.out.println("Enter Radius of Circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + obj.Ar(r));
        sc.close();
    }
}