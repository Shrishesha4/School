// table of m upto n;
import java.util.*;

class Table{
    int n, m;
    Table(int a, int b){
        n = a;
        m = b;
    }

    void display(){
        for (int i = 1; i <= n; i++) {
            System.out.println(m + " x " + i + " = " + m * i);
        }
    }
}
public class mulTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table number: ");
        int m = sc.nextInt();
        System.out.print("Upto?: ");
        int n = sc.nextInt();
        Table obj = new Table(n, m);
        obj.display();
        sc.close();
    }
}
