import java.util.*;
class box {
    double w;
    double h;
    double d;

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        w = sc.nextDouble();
        System.out.println("Enter the height: ");
        h = sc.nextDouble();
        System.out.println("Enter the depth: ");
        d = sc.nextDouble();
        sc.close();
    }
    void vol(){
        System.out.println("Volume is: " + (w*h*d));
    }
}

public class boxVol {    
    public static void main(String[] args) {
        box b = new box();
        b.get();
        b.vol();
    }
}