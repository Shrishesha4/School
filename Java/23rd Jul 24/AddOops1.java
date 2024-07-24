import java.util.*;
public class AddOops1 {
    class Add {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        void get(){
            System.out.println("Enter two numbers: ");
            a = sc.nextInt();
            b = sc.nextInt();
        }
        void cal(){
            c = a + b;
        }
        void display(){
            System.out.println("Sum is: " + c);
        }

    }

    public static void main(String[] args) {
        AddOops1 obj = new AddOops1();
        Add obj1 = obj.new Add();
        obj1.get();
        obj1.cal();
        obj1.display();
    }
}
