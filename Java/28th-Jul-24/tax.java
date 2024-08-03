class person {
    String N;
    double y;
    int z;

    void getDetails(String Name, int Age, double Income){
        N = Name;
        y = Income;
        z = Age;
    }

    void p () {
        System.out.println("s");
    }
}

class income extends person{

    void p () {
        System.out.println("s");
    }

    void getTax(double x){
        if(y >= 250000 && y <= 500000){
            System.out.println("Name: " + N);
            System.out.println("Age: " + z);
            System.out.println("Income: " + y);
            System.out.println("Tax is 10%");
            System.out.println("Taxable income is " + (x * 0.10));
        }
        else if(y >= 500001 && y <= 1000000){
            System.out.println("Name: " + N);
            System.out.println("Age: " + z);
            System.out.println("Income: " + y);
            System.out.println("Tax is 20%");
            System.out.println("Taxable income is " + (x * 0.20));
        }
        else if (y >= 1000001){
            System.out.println("Name: " + N);
            System.out.println("Age: " + z);
            System.out.println("Income: " + y);
            System.out.println("Tax is 30%");
            System.out.println("Taxable income is " + (x * 0.30));
        }
        else {
            System.out.println("Name: " + N);
            System.out.println("Age: " + z);
            System.out.println("Income: " + y);
            System.out.println("No Tax");
            System.out.println("Taxable income is 0");
        }
    }
}

public class tax {
    public static void main(String[] args) {
        String Name = "Sathya";
        int Age = 69;
        double Income = 6900000;
        income obj = new income();
        obj.getDetails(Name, Age, Income);
        obj.getTax(Income);
        obj.p();
    }
}