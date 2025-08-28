public class StringBufferPractise {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming"); //Adds word to the end
        System.out.println("After append: " + sb);

        sb.insert(5, "Language "); // Insert word at index 5
        System.out.println("After insert: " + sb);

        sb.replace(5, 13, "Core");// Replace "Language" with "Core"
        System.out.println("After replace: " + sb);

        sb.delete(5, 10); // Delete "Core "
        System.out.println("After delete: " + sb);

        sb.reverse(); // Reverse the entire string
        System.out.println("After reverse: " + sb);

        char ch = sb.charAt(2); // Get char at index 2
        System.out.println("Character at index 2: " + ch);

        sb.setCharAt(2, 'X'); //Change character at index 2 to 'X'
        System.out.println("After reverse setting X at index 2: " + sb);

    }
}
