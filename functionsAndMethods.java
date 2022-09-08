//               factorial
// public class functionsAndMethods {
//     public static void factorial(int n) {
//         int fact = 1;
//         int num = n;
//         while (n != 0) {
//             fact *= n;
//             n--;
//         }
//         System.out.println("factorial of " + num + " : " + fact);
//     }

//     public static void main(String[] args) {
//         factorial(5);
//     }
// }

//          binomial coefficient
// public class functionsAndMethods {
//     public static int factorial(int n) {
//         int f = 1;
//         for (int i = 1; i <= n; i++) {
//             f = f * i;
//         }
//         return f;
//     }

//     public static int binomial(int n, int r) {
//         int n_fact = factorial(n);
//         int r_fact = factorial(r);
//         int nmr_fact = factorial(n - r);
//         int res;
//         res = (n_fact) / (r_fact * nmr_fact);
//         return res;
//     }

//     public static void main(String[] args) {
//         System.out.println(binomial(5, 2));
//     }
// }

// check prime
// public class functionsAndMethods {

//     public static boolean isPrime(int n) {
//         if (n == 2) {
//             return true;
//         }
//         for (int i = 2; i <= (int) Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         System.out.println(isPrime(73));
//     }
// }

//         prime ranged number
// public class functionsAndMethods {

//     public static boolean isPrime(int n) {
//         if (n == 2) {
//             return true;
//         }
//         for (int i = 2; i <= (int) Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void primeInRange(int n) {
//         for (int i = 1; i <= n; i++) {
//             if (isPrime(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         primeInRange(100);
//     }
// }

//     binary to decimal
// public class functionsAndMethods {
//     public static void binToDec(int decNum) {
//         int pow = 0;
//         int binary = decNum;
//         int decNum = 0;
//         while (decNum > 0) {
//             int lastDigit = decNum % 10;
//             decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

//             pow++;
//             decNum = decNum / 10;
//         }
//         System.out.println("The conversion of " + binary + " to Decimal is : " + decNum);
//     }

//     public static void main(String[] args) {
//         binToDec(1001);
//     }
// }

//         decimal to binary
public class functionsAndMethods {

    public static void decToBin(int decNum) {
        int Decimal = decNum;
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("The conversion of " + Decimal + " to Binary is : " + binNum);
    }

    public static void main(String[] args) {
        decToBin(12);
    }
}