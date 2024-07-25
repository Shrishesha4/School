import java.util.*;
class details{

    String name;
    int regNo;
    double cgpa;
    
    details(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the registration number: ");
        regNo = sc.nextInt();
        System.out.print("Enter the cgpa: ");
        cgpa = sc.nextDouble();
        sc.close();
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Registration number: " + regNo);
        System.out.println("CGPA: " + cgpa);
        
    }
}
public class Stud {    
    public static void main(String[] args) {
        details obj = new details();
        obj.display();
    }
}
