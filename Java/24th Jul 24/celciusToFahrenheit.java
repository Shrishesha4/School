import java.util.*;

class conv {
    double c, f;
    void convert(double c){
        f = (9.0 / 5.0) * c + 32.0;
    }
    void disp(double c) {
        System.out.println(c + " Celsius is " + f + " Fahrenheit.");
    }
    
}
public class celciusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        conv Cel = new conv();
        double c;
        c = sc.nextDouble();
        Cel.convert(c);
        Cel.disp(c);
        sc.close();
    }
}
