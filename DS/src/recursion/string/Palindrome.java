package recursion.string;

// spell the same word forward and backward e.g kayak
public class Palindrome {
    public static void main(String[] args) {
        String input = "racecar";
        boolean isPalindrome = logic1(input);
        System.out.println(isPalindrome);
    }

    private static boolean logic1(String input) {
        if (input.length() == 0 || input.length() == 1)
            return true;
        else if (input.charAt(0) == input.charAt(input.length() - 1))
            return logic1(input.substring(1, input.length() - 1));
        return false;
    }
}
