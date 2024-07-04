import java.util.Scanner;

public class Ptice {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String keyAns = sc.next().toUpperCase();
            
            String adrian = "ABC";
            String bruno = "BABC";
            String goran = "CCAABB";
            
            int adrianScore = 0;
            int brunoScore = 0;
            int goranScore = 0;

            for (int i = 0; i < n; i++) {
                char valid = keyAns.charAt(i);
                if (valid == adrian.charAt(i % adrian.length())) adrianScore++;
                if (valid == bruno.charAt(i % bruno.length())) brunoScore++;
                if (valid == goran.charAt(i % goran.length())) goranScore++;
            }

            int maxScore = Math.max(adrianScore, Math.max(brunoScore, goranScore));
            System.out.println(maxScore);
            if (adrianScore == maxScore) System.out.println("Adrian");
            if (brunoScore == maxScore) System.out.println("Bruno");
            if (goranScore == maxScore) System.out.println("Goran");
        }
    }
}

/*
 * Define all 3 patterns
 * Iterate through keyAns while counting how many times each character matches
 * Loop through the pattern using the modulo function ex. i % 3 = {0, 1, 2}
 * Alphabetically list the names with the highest scores
 */