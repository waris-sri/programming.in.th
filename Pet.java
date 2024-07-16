import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int maxSum = 0;
            int winner = 0;
            int[] scores = new int[5];
            for (int k = 1; k <= 5; k++) {
                int sum = 0;
                for (int i = 0; i < 4; i++) {
                    sum += sc.nextInt();
                }
                scores[k - 1] = sum;
                if (sum > maxSum) {
                    maxSum = sum;
                    winner = k;
                }
            }
            System.out.println(winner + " " + maxSum);
        }
    }
}
