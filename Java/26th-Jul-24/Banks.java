import java.util.*;

class SBI {
    double p, t, r = 8.4;

    SBI(double x, double y) {
        p = x;
        t = y;
    }

    void calculateInterest() {
        double si = (p * r * t) / 100;
        System.out.println("Interest of SBI: " + si + "\n");
    }
}

class ICICI {
    double p, t, r = 7.3;

    ICICI(double x, double y) {
        p = x;
        t = y;
    }

    void calculateInterest() {
        double si = (p * r * t) / 100;
        System.out.println("Interest of ICICI: " + si + "\n");
    }
}

class AXIS {
    double p, t, r = 9.7;

    AXIS(double x, double y) {
        p = x;
        t = y;
    }

    void calculateInterest() {
        double si = (p * r * t) / 100;
        System.out.println("Interest of AXIS: " + si + "\n");
    }
}

public class Banks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principle, time;
        int choice;

        System.out.println("Enter principle and time: ");
        principle = sc.nextDouble();
        time = sc.nextDouble();
        do {

            System.out.println("1 for SBI.\n2 for ICICI.\n3 for AXIS.\n4 to Reenter Details.\n0 to exit.");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    SBI obj1 = new SBI(principle, time);
                    obj1.calculateInterest();
                    break;

                case 2:
                    ICICI obj2 = new ICICI(principle, time);
                    obj2.calculateInterest();
                    break;

                case 3:
                    AXIS obj3 = new AXIS(principle, time);
                    obj3.calculateInterest();
                    break;
                
                case 4:
                    System.out.println("Enter principle and time: ");
                    principle = sc.nextDouble();
                    time = sc.nextDouble();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
