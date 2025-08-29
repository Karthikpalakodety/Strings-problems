import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word : ");
        String Data = sc.nextLine();
        StringBuilder sb = new StringBuilder(Data);
        char charArray[] = new char[sb.length()];
        for (int i = 0; i < sb.length(); i++) {
            charArray[i] = sb.charAt(i);
        }
        StringBuilder sbResult = new StringBuilder();
        for (char ch : charArray) {
            sbResult.append(ch);
        }
        System.out.println("Original String : " + sb);
        System.out.println("Character Array: " + java.util.Arrays.toString(charArray));
        System.out.println("Array to string : " + sbResult);
        sc.close();
    }
}
