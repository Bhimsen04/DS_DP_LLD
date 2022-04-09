package recursion.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-3, -2, 0, 2, 3, 4};  // they must be sorted
        int searchElement = 0, left = 0, right = arr.length - 1;
        boolean result = logic1(arr, searchElement, left, right);
        System.out.println(result);
    }

    private static boolean logic1(int[] arr, int searchElement, int left, int right) {
        if (left > right)
            return false;
        int mid = (left + right) / 2;
        if (arr[mid] == searchElement)
            return true;
        return searchElement > arr[mid] ? logic1(arr, searchElement, mid + 1, right) : logic1(arr, searchElement, left, mid - 1);

    }
}
