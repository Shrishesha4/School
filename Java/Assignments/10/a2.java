class student{
    String x;
    int y;
    void getStudentData(String Name, int Roll){
        x = Name;
        y = Roll;
    }
}


class grade extends student{

    int marks[] = new int[6];
    void getGrade(int m1, int m2, int m3, int m4, int m5, int m6){
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
        marks[3] = m4;
        marks[4] = m5;
        marks[5] = m6;
    }

    void display(){
        System.out.println("Name: " + x);
        System.out.println("Roll No: " + y);
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

public class a2 {
    public static void main(String[] args) {
        String name = "Sathya";
        int rollNo = 192311111;
        int m1 = 98;
        int m2 = 87;
        int m3 = 67;
        int m4 = 69;
        int m5 = 99;
        int m6 = 56;
        grade obj = new grade();
        obj.getStudentData(name, rollNo);
        obj.getGrade(m1, m2, m3, m4, m5, m6);
        obj.display();

    }   
}