package recursion.number;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int num = 10;
        int result = logic1(num);
        System.out.println(result);
    }

    private static int logic1(int num) {
        if (num <= 1)
            return num;
        return logic1(num - 1) + num;
    }
}
