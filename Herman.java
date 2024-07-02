import java.util.Scanner;
import java.lang.Math;

public class Herman {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double radius = sc.nextFloat();
            double euclidean = radius * radius * Math.PI;
            double taxicab = radius * radius * 2;
            System.out.printf("%.6f\n%.6f", euclidean, taxicab);
        }
    }
}