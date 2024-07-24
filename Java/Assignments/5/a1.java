// import java.util.*;
public class a1 {

    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(n*n + " ");
                n++;
            }
            System.out.println();
        }
    }

}
