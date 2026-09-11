public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 19, 25, 33};
        int target = 19;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}