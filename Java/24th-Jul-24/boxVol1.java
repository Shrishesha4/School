import java.util.*;
class box {
    double w;
    double h;
    double d;
    void vol(double w, double h, double d) {
        System.out.println("Volume is: " + (w*h*d));
    }
}

public class boxVol1 {    
    public static void main(String[] args) {
        box b = new box();
        double w;
        double h;
        double d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        w = sc.nextDouble();
        System.out.println("Enter the height: ");
        h = sc.nextDouble();
        System.out.println("Enter the depth: ");
        d = sc.nextDouble();
        b.vol(w, h, d);
        sc.close();
    }
}