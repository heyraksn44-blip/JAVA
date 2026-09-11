public class FindMax {
    public static void main(String[] args) {
        int[] nums = {3, 7, 2, 9, 5};
        int max = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        
        System.out.println("Maximum Element: " + max);
    }
}