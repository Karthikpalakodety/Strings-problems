import java.util.Scanner;

public class ValueCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter value to search : ");
        int target = scanner.nextInt();
        boolean present = false;
        for (int num : arr) {
            if (num == target) {
                present = true;
                break;
            }
        }
        if (present) {
            System.out.print(+ target + " is present in the array.");
        } else {
            System.out.print(+ target + " is NOT present in the array.");
        }
        scanner.close();
    }
}