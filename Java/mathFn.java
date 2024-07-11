import java.util.*;
public class mathFn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Square root of " + a + "is ");
        System.out.println(Math.sqrt(a));
        int x = sc.nextInt();
        System.out.println(a + " power " + x + " is ");
        System.out.println(Math.pow(a,x));
    }
}
