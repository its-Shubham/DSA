//1.
// public class functionAndMethodsPractice {
//     public static float average(float a, float b, float c) {
//         float avg = (a + b + c) / 2;
//         return avg;
//     }

//     public static void main(String[] args) {
//         System.out.println(average(1f, 2f, 3f));
//     }
// }

// 2.
// public class functionAndMethodsPractice {
//     public static boolean isEven(int palindrome) {
//         if (palindrome % 2 == 0) {
//             return true;
//         }
//         return false;

//     }

//     public static void main(String[] args) {
//         System.out.println(isEven(45));
//     }
// }

//3. palindrome
// public class functionAndMethodsPractice {
//     public static void palindrome(int n) {
//         int reverse = 0;
//         int palindrome = n;

//         while (palindrome > 0) {
//             reverse = (reverse * 10) + (palindrome % 10);
//             palindrome = palindrome / 10;
//         }
//         System.out.println("reverse is : " + reverse);
//         if (n == reverse) {
//             System.out.println(n + " is a palindrome");
//         } else {
//             System.out.println(n + " is not a palindrome");
//         }
//     }

//     public static void main(String[] args) {
//         palindrome(5751);
//     }
// }

//4.
// public class functionAndMethodsPractice {
//     public static void main(String[] args) {
//         System.out.println(Math.min(10, 5));
//         System.out.println(Math.max(10, 5));
//         System.out.println(Math.sqrt(2));
//         System.out.println(Math.pow(2, 3));
//         System.out.println(Math.abs(-10));
//     }
// }

//5.
public class functionAndMethodsPractice {
    public static int sumOfDig(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDig(1234));
    }
}