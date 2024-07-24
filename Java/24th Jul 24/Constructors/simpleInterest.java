import java.util.*;

class si {
    double p;
    double r;
    double t;
    double si;
    si(double p, double r, double t) {
        si = (p * r * t) / 100;
    }
    void display() {
        System.out.println("Simple Interest: " + si);
    }
}
public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle: ");
        double p = sc.nextDouble();
        System.out.println("Enter the rate: ");
        double r = sc.nextDouble();
        System.out.println("Enter the time: ");
        double t = sc.nextDouble();
        si obj = new si(p, r, t);
        sc.close();
        obj.display();
    }
}
