import java.util.*;

class BillDetails{
    String name;
    int units;
    double amount;
    int prev;
    int current;
    BillDetails(String n, int p, int c){
        name = n;
        prev = p;
        current = c;
    }

    void calculateBill(){
        units = prev - current;
        if(units <= 100){
            amount = units * 1;
        } else if(units > 100 && units <= 200){
            amount = units * 2.5;
        } else if(units > 200 && units <= 500){
            amount = units * 4;
        } else if(units > 500){
            amount = units * 6;
        } else {
            System.out.println("Invalid units");
        }
    }
}

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and units: ");
        String name = sc.nextLine();
        int PrevUnits = sc.nextInt();
        int CurrentUnits = sc.nextInt();
        BillDetails obj = new BillDetails(name, PrevUnits, CurrentUnits);
        obj.calculateBill();
        System.out.println("Bill amount: " + obj.amount);
        sc.close();
    }
}
