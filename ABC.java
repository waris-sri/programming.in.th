import java.util.*;

public class ABC {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            /*
             * sort numbers ascendingly and assign them to A, B, and C respectively
             * when A, B, and C are jumbled, the true order form the numbers is still intact
             */
            int[] num = new int[3];
            int i;
            for (i = 0; i < 3; i++) {
                num[i] = sc.nextInt();
            }
            
            String abc = sc.next().toUpperCase();
            Arrays.sort(num); // A < B < C

            for (i = 0; i < 3; i++) {
                if (abc.charAt(i) == 'A') {
                    System.out.printf("%d ", num[0]);
                } else if (abc.charAt(i) == 'B') {
                    System.out.printf("%d ", num[1]);
                } else if (abc.charAt(i) == 'C') {
                    System.out.printf("%d ", num[2]);
                }
            }
        }
    }
}