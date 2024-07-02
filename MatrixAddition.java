import java.util.*;

public class MatrixAddition {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt(); // Number of rows
            int n = sc.nextInt(); // Number of columns

            long[][] m1 = new long[m][n];
            long[][] m2 = new long[m][n];
            long[][] ans = new long[m][n];

            int i, j = 0;
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    m1[i][j] = sc.nextLong();
                }
            }

            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    m2[i][j] = sc.nextLong();
                }
            }

            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    ans[i][j] = m1[i][j] + m2[i][j];
                }
            }

            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.printf("%d ", ans[i][j]);
                }
                System.out.println();
            }
        }
    }
}