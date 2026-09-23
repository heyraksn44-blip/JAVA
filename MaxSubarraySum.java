public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSoFar = numbers[0];
        int currentMax = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            currentMax = Math.max(numbers[i], currentMax + numbers[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        System.out.println("Maximum Subarray Sum: " + maxSoFar);
    }
}