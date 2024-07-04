import java.util.Scanner;
public class GreatCommonDivisor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int gcd = 1; // default value
            // The divisor cannot exceed a or b to divide properly
            for (int divisor = 2; divisor <= a && divisor <= b;) {
                // Check if a and b are divisible, if so, divide them both
                if (a % divisor == 0 && b % divisor == 0) {
                    a /= divisor;
                    b /= divisor;
                    gcd *= divisor; // Keep multiplying the divisors to gcd
                    divisor = 2; // Reset the divisor back to 2
                } else {
                    divisor++; // If a and b aren't divisible, keep incrementing the divisor
                }
            }
            System.out.println(gcd);
        }
    }
}