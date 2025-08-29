import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first word : ");
        StringBuffer word1 = new StringBuffer(scanner.nextLine().replaceAll("\\s", "").toLowerCase());

        System.out.print("Enter second word : ");
        StringBuffer word2 = new StringBuffer(scanner.nextLine().replaceAll("\\s", "").toLowerCase());

        if (word1.length() != word2.length()) {
            System.out.println("anagrams are not present ");
        } else {
            boolean Anagram = true;
            for (int i = 0; i < word1.length(); i++) {
                char ch = word1.charAt(i);
                int index = word2.indexOf(String.valueOf(ch));
                if (index != -1) {
                    word2.deleteCharAt(index);
                } else {
                    Anagram = false;
                    break;
                }
            }
            System.out.println(Anagram && word2.length() == 0 ? " Word is a Anagram" : " Word is not a anagram");
        }

        scanner.close();
    }
}
