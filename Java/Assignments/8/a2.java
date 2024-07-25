import java.util.*;
class Stud{
    String a, b;
    int c;

    void getReg(String x){
        a = x;
    }
    void getName(String y){
        b = y;
    }
    void getMarks(int z){
        c = z;
    }

    void display(){
        System.out.println("Registration number: " + a);
        System.out.println("Name: " + b);
        System.out.println("Marks: " + c);
    }

}
public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String RegNo, name;
        int marks;
        Stud obj = new Stud();

        System.out.print("Enter the registration number: ");
        RegNo = sc.nextLine();
        obj.getReg(RegNo);
        
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        obj.getName(name);
        
        System.out.print("Enter the marks: ");
        marks = sc.nextInt();
        obj.getMarks(marks);
        
        obj.display();
        
        sc.close();
    }
}