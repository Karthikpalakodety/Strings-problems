import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Word/String : ");
        String input = scanner.nextLine();
        System.out.print("Length of word : " + input.length()); // for length of word

        System.out.println("\nCharacters in the string : ");
        for (int i = 0; i < input.length(); i++) {
            System.out.println("charAt("+ i +") is : " + input.charAt(i)); // for find char at given index
            
        }
        System.out.println("\nUppercase: " + input.toUpperCase()); //converation
        System.out.println("Lowercase: " + input.toLowerCase());

        System.out.print("\nEnter another word to compare: "); //comparision
        String compareStr = scanner.nextLine();
        System.out.println("Equals: " + input.equals(compareStr));
        System.out.println("Equals-ingnorecase: " + input.equalsIgnoreCase(compareStr)); //ignores with and case sensitivity
        //System.out.println("First index of input : " + input.indexOf('a')); // gives index value

        scanner.close();

    }
}
