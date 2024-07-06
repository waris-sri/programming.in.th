import java.util.Scanner;

public class SevenDwarves {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] dwarves = new int[9];
            int i, j, imposters, sum = 0;

            for (i = 0; i < dwarves.length; i++) {
                dwarves[i] = sc.nextInt();
                sum += dwarves[i];
            }

            for (i = 0; i < dwarves.length - 1; i++) {
                for (j = i + 1; j < dwarves.length; j++) {
                    if (sum - 100 == dwarves[i] + dwarves[j]) {
                        for (imposters = 0; imposters < dwarves.length; imposters++) {
                            if (imposters != i && imposters != j) {
                                System.out.println(dwarves[imposters]);
                            }
                        }
                    }
                }
            }
        }
    }
}

// Since the sum of the two imposters equals the sum of all dwarves minus 100,
// they can be found by subtracting the sum of the two imposters from the sum of
// all dwarves,
// and print the remaining real dwarves.