import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements to filter :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> uniqueElements = new HashSet<>();
        for (int number : arr) {
            uniqueElements.add(number);
        }
        System.out.println("Array after removing duplicates : ");
        for (int number : uniqueElements) {
            System.out.print(number + " ");
        }
        sc.close();
    }
}