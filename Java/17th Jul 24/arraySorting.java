import java.util.*;
public class arraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Ascending.\n2. Descending.");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        int arr[] = new int[10];
        if (choice == 1) {
            System.out.println("Enter array elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("Sorted array in ascending order: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else if (choice == 2) {
            System.out.println("Enter array elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Sorted array in descending order: ");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
