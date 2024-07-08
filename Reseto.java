import java.util.Scanner;

public class Reseto {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n + 1]; // Stores the count of prime numbers
            solve(n, k, arr);
        }
    }

    static void solve(int n, int k, int[] arr) {
        int cnt = 0;
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

/*
 * Use 2-index array since sequence starts with 2 and for easy reference
 * Initially set all elements in array to 0
 * Prepare a counter to increment each time when:
 * - the element at current index is 0
 * - `i` and `j` are perfectly divisible
 * - `i` = index, `j` = multiple of `i` (`j += i`)
 * The counter will increase while marking the processed numbers
 * When the counter reached `k`, print current index, and halt program
 */
