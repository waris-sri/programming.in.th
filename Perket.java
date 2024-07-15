import java.util.Scanner;

public class Perket {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] sour = new int[n], bitter = new int[n];
            for (int i = 0; i < n; i++) {
                int s = sc.nextInt(), b = sc.nextInt();
                sour[i] = s;
                bitter[i] = b;
            }
            System.out.println(solve(sour, bitter, n));
        }
    }

    static int solve(int[] sour, int[] bitter, int n) {
        int min = Integer.MAX_VALUE;
        int totalPossibleSubsets = (int) Math.pow(2, n) - 1; // Exclude the empty subset
        for (int subset = 1; subset <= totalPossibleSubsets; subset++) {
            int sourness = 1, bitterness = 0; // Initiate ground values to be calculated on later
            // Convert each subset to binary string:
            // `1` = include current ingredient, `0` = exclude current ingredient
            String binarySubset = Integer.toBinaryString(subset);
            for (int i = 0; i < binarySubset.length(); i++) {
                if (binarySubset.charAt(binarySubset.length() - 1 - i) == '1') {
                    sourness *= sour[i];
                    bitterness += bitter[i];
                }
            }
            int diff = Math.abs(sourness - bitterness);
            min = Math.min(min, diff);
        }
        return min;
    }
}

// 1
// 3 10

// 4
// 1 7
// 2 6
// 3 8
// 4 9

// 2
// 3 8
// 5 8