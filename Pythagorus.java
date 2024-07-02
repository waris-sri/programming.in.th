import java.util.Scanner;
import java.lang.Math;
public class Pythagorus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("%.6f", c);
    }
}