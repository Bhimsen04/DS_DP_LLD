package recursion.string;

public class StringReversal {
    public static void main(String[] args) {
        String input = "the simple enginner";
        System.out.println("rm".substring(1));
        System.out.println(logic1(input, input.length() - 1));
        System.out.println(logic2(input));
        System.out.println(logic3(input));    // best one
    }

    private static String logic3(String input) {
        // base case
        if (input.equals(""))
            return input;
        // smallest amount of work i can do in each iteration.
        // ATM queue logic here
        return logic3(input.substring(1)) + input.charAt(0);
    }

    private static String logic2(String input) {
        if (input.equals(""))      // base case
            return input;
        return input.charAt(input.length() - 1) + logic2(input.substring(0, input.length() - 1));
    }

    private static String logic1(String input, int length) {
        if (length < 0)      // base case
            return "";
        return input.charAt(length) + logic1(input, length - 1);
    }
}
