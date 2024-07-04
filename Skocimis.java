import java.util.Arrays;
import java.util.Scanner;

public class Skocimis {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] n = new int[3];
            for (int i = 0; i < 3; i++) {
                n[i] = sc.nextInt();
            }
            Arrays.sort(n);
            int maxGap = Math.max(n[1] - n[0], n[2] - n[1]) - 1;
            System.out.println(maxGap);
        }
    }
}

// Simply find the largest gap between 2 consecutive kangaroos and minus 1