public class MajorityElement {
    public static void main(String[] args) {
        int[] numbers = {2, 2, 1, 1, 1, 2, 2};
        int candidate = numbers[0];
        int count = 1;

        // Boyer-Moore Voting Algorithm
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = numbers[i];
                    count = 1;
                }
            }
        }

        System.out.println("Majority element is: " + candidate);
    }
}