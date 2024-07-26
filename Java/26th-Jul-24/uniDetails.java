import java.util.*;

class Student{
    String name;
    int rollNo;
    int marks[] = new int[5];

    Student(String n, int r, int m1, int m2, int m3, int m4, int m5){
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
        System.out.println("Average Marks: " + total/5);

    }
}

public class uniDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, roll no. and marks of 5 subjects: ");
        Student obj = new Student(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        obj.display();
        sc.close();
    }
}
