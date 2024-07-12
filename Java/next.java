import java.util.*;
public class next {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.next();
        char firstCharacter = inputString.charAt(0);
        System.out.println("The first character of the string is: " + firstCharacter);
        sc.close();
    }
}