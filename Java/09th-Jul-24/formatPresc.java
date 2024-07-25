import java.util.*;
public class formatPresc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        System.out.format("%.2f", b);
        System.out.println();
        sc.close();
    }
}
