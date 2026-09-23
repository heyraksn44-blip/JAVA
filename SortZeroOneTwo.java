public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 1, 0, 2, 1, 0};
        int low = 0, mid = 0, high = numbers.length - 1;

        while (mid <= high) {
            if (numbers[mid] == 0) {
                int temp = numbers[low];
                numbers[low] = numbers[mid];
                numbers[mid] = temp;
                low++;
                mid++;
            } else if (numbers[mid] == 1) {
                mid++;
            } else {
                int temp = numbers[mid];
                numbers[mid] = numbers[high];
                numbers[high] = temp;
                high--;
            }
        }

        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}