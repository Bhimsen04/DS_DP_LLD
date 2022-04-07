package recursion.number;

public class DecimalToBinary {
    public static void main(String[] args) {
        int input = 23334;
        System.out.println(logic1(input));
        System.out.println(logic2(input, ""));
    }

    private static String logic1(int input) {
        if (input == 1)
            return "1";
        return logic1(input / 2) + input % 2;
    }

    private static String logic2(int input, String result) {
        if (input == 0)
            return result;
        result = input % 2 + result;
        return logic2(input / 2, result);
    }
}
