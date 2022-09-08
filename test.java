// // /* package codechef; // don't place package name! */

// // import java.util.*;

// // /* Name of the class has to be "Main" only if the class is public. */
// // public class test {
// //     public static void main(String[] args) throws java.lang.Exception {
// //         // your code goes here
// //         Scanner sc = new Scanner(System.in);
// //         int cases = sc.nextInt();
// //         while (cases > 0) {
// //             int n = sc.nextInt();
// //             int A = 1 + n;
// //             int x = 1;
// //             int c = 2 + x;

// //             while (true) {
// //                 if (c % A == 0 && c % c == 0) {
// //                     System.out.println(n + " " + x);
// //                 }
// //                 break;
// //             }
// //             ++x;

// //         }
// //     }
// // }

// // import java.io.*;
// // import java.util.*;

// // public class test {

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int i = sc.nextInt();
// //         double d = sc.nextDouble();
// //         String str = sc.nextLine();
// //         System.out.println(d);
// //         System.out.println(i);
// //         System.out.println(str);
// //     }
// // }

// // public class test {
// //     public static void main(String[] args) {
// //         int i = 010;
// //         int j = 07;
// //         System.out.println(i);
// //         System.out.println(j);
// //     }
// // }

// // class a {
// //     int add(int i, int j) {
// //         return i + j;
// //     }
// // }

// // public class test extends a {
// //     public static void main(String[] args) {
// //         short s = 9;
// //         System.out.println(add(s, 6));
// //     }
// // }

// class SampleDemo implements Runnable {
//     private Thread t;
//     private String threadName;

//     SampleDemo(String threadName) {
//         this.threadName = threadName;
//     }

//     public void run() {
//         while (true)
//             System.out.print(threadName);
//     }

//     public void start() {
//         if (t == null) {
//             t = new Thread(this, threadName);
//             t.start();
//         }
//     }
// }

// public class test {
//     public static void main(String[] args) {
//         SampleDemo A = new SampleDemo("A");
//         SampleDemo B = new SampleDemo("B");

//         B.start();
//         A.start();
//     }
// }
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//class Result {
//
//    /*
//     * Complete the 'simpleArraySum' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts INTEGER_ARRAY ar as parameter.
//     */
//
//    public static int simpleArraySum(List<Integer> ar) {
//        // Write your code here
//        int sum = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            sum += ar.get(i);
//        }
//        return sum;
//
//    }
//}
//
//public class test {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int result = Result.simpleArraySum(ar);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X < Y) {
                System.out.println("REPAIR");
            } else if (X > Y) {
                System.out.println("NEW PHONE");
            } else {
                System.out.println("ANY");
            }

        }

    }
}