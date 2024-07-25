
import java.util.*;
public class arrayLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int num = sc.nextInt();
        sc.close();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("The number is found at index " + i);
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("The number is not found in the array");
        }
    }
}
