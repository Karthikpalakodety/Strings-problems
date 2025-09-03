import java.util.Scanner;

public class ArrayCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number of elements in the array : ");
        int size = sc.nextInt();
        if (size == 0) {
            System.out.println(" Array is empty.");
        }
        else {
            int[] numbers = new int[size];
            System.out.println(" Enter " + size + " elements : ");
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }
            System.out.println(" The array is not empty. ");
        }
        sc.close();
    }
}
