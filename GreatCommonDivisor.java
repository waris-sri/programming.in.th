import java.util.Scanner;

public class GreatCommonDivisor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(findGcd(a, b));
        }
    }

    static int findGcd(int a, int b) {
        if (b == 0)
            return a;
        return findGcd(b, a % b);
    }
}