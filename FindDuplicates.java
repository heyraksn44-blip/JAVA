public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.print("Duplicate elements: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[i] + " ");
                    break;
                }
            }
        }
    }
}