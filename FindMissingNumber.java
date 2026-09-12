public class FindMissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6};
        int n = numbers.length + 1;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : numbers) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}