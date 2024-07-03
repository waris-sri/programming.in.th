import java.util.*;

public class Modulo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            /*
             * allocate empty arr[10] for int inputs
             * mod(42) to each of them
             * initialize duplicates counter, ++ each time a duplicate is found
             * return duplicates counter
             */
            int[] vals = new int[10];
            for (int i = 0; i < 10; i++) {
                vals[i] = sc.nextInt();
            }
            
            for (int i = 0; i < 10; i++) {
                vals[i] = vals[i] % 42;
            }
            
            int uniqueCnt = 0;
            int[] uniqueVals = new int[10];
            for (int i = 0; i < 10; i++) {
                boolean isFound = false;
                for (int j = 0; j < uniqueCnt; j++) {
                    if (vals[i] == uniqueVals[j]) {
                        isFound = true;
                        break; // exit the loop instantly when met a duplicate
                    }
                }
                if (!isFound) {
                    uniqueVals[uniqueCnt] = vals[i];
                    uniqueCnt++;
                }
            }

            System.out.println(uniqueCnt);
        }
    }
}

// Using HashSet (better):
// public class Modulo {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             Set<Integer> vals = new HashSet<>();
//             for (int i = 0; i < 10; i++) {
//                 int mod = sc.nextInt() % 42;
//                 vals.add(mod);
//             }
//             System.out.println(vals.size());
//         }
//     }
// }