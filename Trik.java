import java.util.*;

public class Trik {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // state all 3 possible positions as indices
            int[] pos = new int[]{0, 1, 2};
            String input = sc.next().toUpperCase();
            
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                switch (currentChar) {
                    case 'A':
                        swap(pos, 0, 1);
                        break;
                    case 'B':
                        swap(pos, 1, 2);
                        break;
                    case 'C':
                        swap(pos, 0, 2);
                        break;
                }
            }

            for (int i = 0; i < 3; i++) {
                if (pos[i] == 0) {
                    System.out.printf("%d", i + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}