/* Find the area of Triangle using Static Variable */

import java.util.Scanner;

class Shrishesha1{
    static double area;
    static double x;
    static double y;
    Shrishesha1(double base, double height){
        x = base;
        y = height;
    }
    void cal(){
        area = 0.5 * x * y;
    }
    void display(){
        System.out.println("Area of Triangle is " + area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height: ");
        Shrishesha1 obj = new Shrishesha1(sc.nextDouble(), sc.nextDouble());
        obj.cal();
        obj.display();
        sc.close();
    }
}