import java.util.*;

class fact{
    int num;
    
    fact(int x){
        num = x;
    }
    
    int Fact(){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    void display(){
        System.out.println("Factorial of " + num + " is: " + Fact());
    }
}

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        fact obj = new fact(sc.nextInt());
        obj.display();
        sc.close();
    }
}
