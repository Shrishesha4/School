import java.util.Scanner;
public class a2 {
    class SimpleInterest {
        void calculateInterest(double principal, double rate, int time) {
            double interest = (principal * rate * time) / 100;
            System.out.println("Simple Interest: " + interest);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a2 obj = new a2();
        SimpleInterest si = obj.new SimpleInterest();
        
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time period in years: ");
        int time = sc.nextInt();

        sc.close();
        
        si.calculateInterest(principal, rate, time);
    }
}
