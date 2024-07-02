import java.util.Scanner;

public class X2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x1 = sc.nextInt();
            int s = sc.nextInt();
            System.out.println((2 * s) - x1);
        }
    }
}