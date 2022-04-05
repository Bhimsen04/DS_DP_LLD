package recursion.number;

public class DecimalToBinary {
    public static void main(String[] args) {
        int input = 233;
        String result = logic1(input);
        System.out.println(result);
    }

    private static String logic1(int input) {
        if (input == 1)
            return "1";
        return logic1(input / 2) + input % 2;
    }
}
