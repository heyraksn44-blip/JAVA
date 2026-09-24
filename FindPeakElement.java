public class FindPeakElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1};
        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] > numbers[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Peak element index is: " + low);
        System.out.println("Peak element value is: " + numbers[low]);
    }
}