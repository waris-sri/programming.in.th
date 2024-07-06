import java.util.Arrays;
import java.util.Scanner;

public class Kornislav {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = new int[4];
            Arrays.setAll(nums, i -> sc.nextInt());
            Arrays.sort(nums);
            System.out.println(solve(nums));
        }
    }

    static int solve(int[] nums) {
        int ans = nums[0] * nums[2];
        return ans;
    }
}

// Sort the array, then output the product of 1st and 3rd values.