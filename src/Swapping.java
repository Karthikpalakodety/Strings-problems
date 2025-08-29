import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Word : ");
        String St = scanner.nextLine();

        if (St.length() != 3) {
            System.out.println("Input must be exactly 3 characters.");
        } else {
            StringBuilder sb = new StringBuilder(St);
            char first = sb.charAt(0);
            char second = sb.charAt(1);
            sb.setCharAt(0,second);
            sb.setCharAt(1, first);
            System.out.println("Swapped Word : " + sb.toString());
        }
        scanner.close();
    }
}
