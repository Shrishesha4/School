import java.util.*;
public class AddOops2 {
    class Add {
        int a, b, c;
        void Sum(int a, int b){
            c = a + b;
        }
        void display(){
            System.out.println("Sum is: " + c);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddOops2 obj = new AddOops2();
        Add obj1 = obj.new Add();
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj1.Sum(a, b);
        obj1.display();
        sc.close();
    }
}
