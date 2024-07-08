import java.util.Scanner;

public class Reseto {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n + 1];
            solve(n, k, arr);
        }
    }

    static void solve(int n, int k, int[] arr) {
        int cnt = 0;
        // Use 2-based index array
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                for (int j = i; j <= n; j += i) {
                    if ((j % i == 0) && (arr[j] == 0)) {
                        cnt++;
                        arr[j] = cnt;
                        if (cnt == k) {
                            System.out.println(j);
                        }
                    }
                }
            }
        }
    }
}
