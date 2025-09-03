import java.util.Scanner;

public class CharOccurence {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the words : ");
        String st =sc.nextLine();
        System.out.print("Enter the character to count: ");
        char ch = sc.next().charAt(0);
        String charAsSt = String.valueOf(ch);
        int count = st.length() - st.replace(charAsSt, "").length();
        System.out.println("Number of occurences of;"+charAsSt+" in "+st+" = "+count);
    }
}