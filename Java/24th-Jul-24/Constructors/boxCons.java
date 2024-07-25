import java.util.*;
class box {
    double w;
    double h;
    double d;
    double ans;
    
    box(double w, double h, double d) {
       ans = (w*h*d);
    }

    void display(){
        System.out.println("Volume is: " + ans);
    }
}

public class boxCons {    
    public static void main(String[] args) {

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
        box b = new box(w, h, d);
        sc.close();
        b.display();
    }
}