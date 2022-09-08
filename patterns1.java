import java.util.*;

// Star pattern
// public class patterns1 {
//     public static void main(String[] args) {
//         for (int line = 1; line <= 10; line++) {
//             for (int star = 1; star <= line; star++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

// }

// Inverted star pattern
// public class patterns1 {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int line = 1; line <= n; line++) {
//             for (int s = 1; s <= n - line + 1; s++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/* 1
 * 12
 * 123
 * 1234
 * pattern
 */

// public class patterns1 {
//     public static void main(String[] args) {
//         for (int line = 1; line <= 4; line++) {
//             for (int num = 1; num <= line; num++) {
//                 System.out.print(num);
//             }
//             System.out.println();
//         }
//     }
// }

public class patterns1 {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}