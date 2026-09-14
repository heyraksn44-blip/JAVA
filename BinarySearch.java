public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int low = 0, high = numbers.length - 1;
        int foundIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (numbers[mid] == target) {
                foundIndex = mid;
                break;
            } else if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Element found at index: " + foundIndex);
        } else {
            System.out.println("Element not found.");
        }
    }
}