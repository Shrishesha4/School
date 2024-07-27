
import java.util.*;
class Details {

    String name;
    int rollNo;
    int marks[] = new int[5];
    Details(String n, int r, int m1, int m2, int m3, int m4, int m5){
        name = n;
        rollNo = r;
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
        marks[3] = m4;
        marks[4] = m5;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        int total = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
        System.out.println("Marks: " + marks[0] + " " + marks[1] + " " + marks[2] + " " + marks[3] + " " + marks[4]);
        System.out.println("Total marks: " + total);
        System.out.println("Aggregate: " + total/5);
        if(total/5 >= 75){
            System.out.println("Distinction");
        } else if(total/5 >= 60 && total/5 < 75){
            System.out.println("First Division");
        } else if(total/5 >= 50 && total/5 < 60){
            System.out.println("Second Division");
        } else if(total/5 >= 40 && total/5 < 50){
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }
    }
}

public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter roll no: ");
        int rollNo = sc.nextInt();
        System.out.println("Enter marks of 5 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        Details obj = new Details(name, rollNo, m1, m2, m3, m4, m5);
        obj.display();
        sc.close();
    
    }
}
