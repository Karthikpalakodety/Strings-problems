/*import java.util.Scanner;

public class DigitsOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input : ");
        String Number = sc.nextLine();
        boolean onlyDigits = true;
        for (int i = 0; i < Number.length() ; i++) {
            if (!Character.isDigit(Number.charAt(i))){
                onlyDigits=false;
                break;
            }
        }
        System.out.println("Input contains numbers or not (T/F) : " +onlyDigits);
        sc.close();
    }
}*/


import java.util.Scanner;
public class DigitsOnly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a input : ");
        StringBuilder Number = new StringBuilder(scanner.nextLine());
        boolean onlyDigits = true;
        for (int i = 0; i < Number.length(); i++) {
            if (!Character.isDigit(Number.charAt(i))) {
                onlyDigits = false;
                break;
            }
        }
        System.out.println("Input contains numbers or not (T/F): " + onlyDigits);
        scanner.close();
    }
}

