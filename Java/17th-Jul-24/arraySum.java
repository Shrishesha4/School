import java.util.*;
public class arraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum = 0;
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("The sum of array elements is: " + sum);
        sc.close();
    }    
}
