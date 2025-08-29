import java.sql.SQLOutput;
import java.util.Scanner;

public class WordsCOunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence : ");
        StringBuffer input = new StringBuffer(sc.nextLine().trim());
        if (input.length() == 0) {
            System.out.println("Word count: 0");
        } else {
            String[] words = input.toString().split("\\s+");
            System.out.println("Word count: " + words.length);
        }
    }
}



// toString() -- Converts builder to string