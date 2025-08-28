import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the S1 : ");
        String S1 = scanner.nextLine();

        System.out.print("Enter the S2 : ");
        String S2 = scanner.nextLine();

        String concatenate = S1 + " " + S2;
        System.out.print("Fullname is : " +concatenate);

    }
}
