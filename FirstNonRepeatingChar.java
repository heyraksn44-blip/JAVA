public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        char firstNonRepeating = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                firstNonRepeating = str.charAt(i);
                break;
            }
        }

        if (firstNonRepeating != ' ') {
            System.out.println("First non-repeating character in '" + str + "': " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found in '" + str + "'.");
        }
    }
}