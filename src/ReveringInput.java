/*import java.util.Scanner;
public class ReveringInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        for (int i = 0; i < sb.length() / 2; i++) {
            int first = i;
            int last = sb.length() - 1 - i;
            char firstChar = sb.charAt(first);
            char lastChar = sb.charAt(last);

            sb.setCharAt(first, lastChar);
            sb.setCharAt(last, firstChar);
        }
        System.out.println("Reversed string: " + sb);
        scanner.close();
    }
}*/

import java.util.Scanner;
public class ReveringInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse : ");
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println("Reversed string: " + sb.toString());
        scanner.close();
    }
}

