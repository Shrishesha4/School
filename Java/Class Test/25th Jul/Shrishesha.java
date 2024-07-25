import java.util.*;

class QR{
    int num1, num2, rem, quo;

    QR(int x, int y){
        num1 = x;
        num2 = y;
    }

    void cal(){
        rem = num1 % num2;
        quo = num1 / num2;
    }
    
    void display(){
        System.out.println("Quotient (" + num1 + "/" + num2 + ") is: " + quo);
        System.out.println("Remainder (" + num1 + "%" + num2 + ") is: " + rem);
    }
    
}

public class Shrishesha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        QR obj = new QR(sc.nextInt(), sc.nextInt());
        obj.cal();
        obj.display();
        sc.close();
    }
}
