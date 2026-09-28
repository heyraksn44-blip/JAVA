import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] numbers = {100, 4, 200, 1, 3, 2};
        if (numbers.length == 0) {
            System.out.println("Longest consecutive sequence length: 0");
            return;
        }

        Arrays.sort(numbers);
        int longest = 1;
        int currentStreak = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                if (numbers[i] == numbers[i - 1] + 1) {
                    currentStreak++;
                } else {
                    longest = Math.max(longest, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        longest = Math.max(longest, currentStreak);
        System.out.println("Longest consecutive sequence length: " + longest);
    }
}