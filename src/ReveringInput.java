public class ReveringInput {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        for (int i = 0; i < sb.length()/2; i++) {
            int first = i;
            int last  = sb.length()-1-i; //Hello is total 5-1-0=4
            char firstchar= sb.charAt(first);
            char lastchar = sb.charAt(last);

            sb.setCharAt(first,lastchar);
            sb.setCharAt(last,firstchar);
        }
        System.out.println(sb);
    }
}
