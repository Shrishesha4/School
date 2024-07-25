import java.util.*;

class Div{
    int num;
    Div(int x){
        num = x;
    }
    
    void check(){
        if (num % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

public class oddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        Div obj = new Div(x);
        obj.check();
        sc.close();
    }
}
