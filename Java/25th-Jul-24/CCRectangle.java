import java.util.*;

class Area {
    int area, l, br;

    Area(int a, int b){
        l = a;
        br = b;
        cal();
    }

    void cal(){
        area = l * br;
    }

    Area(Area C){
        l = C.l;
        br = C.br;
        area = C.area; 
    }
}

public class CCRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        Area obj = new Area(sc.nextInt(), sc.nextInt());
        Area C = new Area(obj);
        sc.close();
        System.out.println("Area of Rectangle: " + obj.area);
        System.out.println("Area of Rectangle using Copy Constructor: " + C.area);
    }
}
