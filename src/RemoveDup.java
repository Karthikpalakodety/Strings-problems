import java.util.Scanner;


public class RemoveDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] unique = new int[size];
        int Count = 0;
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < Count; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                unique[Count] = arr[i];
                Count++;
            }
        }
        System.out.println("Array after removing duplicates : ");
        for (int i = 0; i < Count; i++) {
            System.out.print(unique[i] + " ");
        }
        sc.close();
    }
}