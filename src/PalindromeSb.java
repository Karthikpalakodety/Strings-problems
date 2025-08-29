import java.util.Scanner;

public class PalindromeSb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = scanner.nextLine();
        String original = input.toLowerCase();  // converts any string to lower alphabets
        String reversed = new StringBuilder(original).reverse().toString();
        boolean isPalindrome = original.equals(reversed);
        System.out.println("Is palindrome :  " + isPalindrome);
        scanner.close();
    }
}



