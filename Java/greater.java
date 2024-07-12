import java.util.*;
public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else {
            System.out.println(num2 + " is greater");
        }
    }
}
