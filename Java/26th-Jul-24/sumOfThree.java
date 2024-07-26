import java.util.*;

class AddThree {
    int x, y, z;
    AddThree(int a, int b, int c){
        x = a;
        y = b;
        z = c;
    }

    void display(){
        int sum = x + y + z;
        System.out.println("The sum of " + x + " + " +  y  + " + " + z + " is " + sum);
    }
}

public class sumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        AddThree obj = new AddThree(sc.nextInt(), sc.nextInt(), sc.nextInt());
        obj.display();
        sc.close();
    }
}
