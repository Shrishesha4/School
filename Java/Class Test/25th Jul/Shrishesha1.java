import java.util.*;

class Sum{
    int num, sum;
    Sum(int x){
        num = x;
    }

    void series(){
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
    }
    void display(){
        System.out.println("Sum of series: " + sum);
    }
}

public class Shrishesha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Sum obj = new Sum(sc.nextInt());
        obj.series();
        obj.display();
        sc.close();
    }
    
}
