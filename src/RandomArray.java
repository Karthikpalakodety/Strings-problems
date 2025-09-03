import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size =sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size ; i++) {
            array[i]=(int)(Math.random()*100);
        }
        System.out.println("Values in the array are : " );
        for (int num : array) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
