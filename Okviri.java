import java.util.Scanner;

public class Okviri {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            /*
             * break each line into its own and keep appending it to itself within string
             * length
             * access and pull out each character from the string with charAt()
             * for each character index on the multiple of 3, replace # with *
             * overlap the * frame (higher importance) above # frame; delete the last
             * character of l2 first
             */
            String str = sc.nextLine();
            StringBuilder l1 = new StringBuilder(); // same as l5
            StringBuilder l2 = new StringBuilder(); // same as l4
            StringBuilder l3 = new StringBuilder();

            for (int i = 1; i <= str.length(); i++) {
                if (i == 1) {
                    l1.append("..#..");
                    l2.append(".#.#.");
                    l3.append("#.").append(str.charAt(i - 1)).append(".#");
                } else if (i % 3 == 0) {
                    l1.append(".*..");
                    l2.append("*.*.");
                    if (l3.charAt(l3.length() - 1) == '#') {
                        l3.deleteCharAt(l3.length() - 1);
                        l3.append("*");
                    }
                    l3.append(".").append(str.charAt(i - 1)).append(".*");
                } else {
                    l1.append(".#..");
                    l2.append("#.#.");
                    l3.append(".").append(str.charAt(i - 1)).append(".#");
                }
            }

            System.out.println(l1);
            System.out.println(l2);
            System.out.println(l3);
            System.out.println(l2);
            System.out.println(l1);
        }
    }
}