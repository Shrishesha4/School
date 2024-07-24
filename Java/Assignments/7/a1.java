import java.util.Scanner;

class a1 {
     class Triangle {
         void calculateArea(double base, double height) {
             double area = 0.5 * base * height;
             System.out.println("Area of the Triangle: " + area);
         }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a1 obj = new a1();
        Triangle triangle = obj.new Triangle();
        
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        sc.close();
        
        triangle.calculateArea(base, height);
    }
}
