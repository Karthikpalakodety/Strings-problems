import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int value = 2;
        int a = 3;
        int c = 11;
        int m = 100;
        for (int i = 0; i < size; i++) {
            value = (a * value + c) % m;
            arr[i] = value;
        }
        System.out.println("Array with random numbers is :");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        input.close();
    }
}
