import java.util.*;
public class armstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        int sum = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is an Armstrong number.");
        }
    }
}
