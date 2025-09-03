import java.util.Scanner;

public class ArrayCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        if (size > 0) {
            System.out.println("Enter the elements : ");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }
        }
        if (arr.length == 0) {
            System.out.println("The array is empty.");
        } else {
            System.out.println("The array is not empty.");
        }
        input.close();
    }
}
