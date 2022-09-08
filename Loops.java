import java.util.Scanner;

// public class Loops {
// public static void main(String[] args) {
// int counter = 0;
// while (counter < 100) {
// System.out.println("hello world");
// counter++;
// }
// }
// }

// public class Loops {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int i = 1, sum = 0;
// int n = sc.nextInt();
// while (i <= n) {
// sum += i;
// i++;
// }
// System.out.println("Sum is : " + sum);
// }

// }

// public class Loops {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int rev = 0;
// int n = sc.nextInt();
// while (n > 0) {
// int lastDigit = n % 10;
// rev = (rev * 10) + lastDigit;
// n = n / 10;
// }
// System.out.println("Reverse of the number is : " + rev);
// }

// }

// public class Loops {
// public static void main(String[] args) {
// int counter = 1;
// do {
// System.out.print(counter + " ");
// counter++;
// } while (counter <= 10);
// }
// }

// 2. Add Even and Odd Numbers
// public class Loops {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int sumEven = 0, sumOdd = 0;
// int number, choice;

// do {
// System.out.println("Enter the number");
// number = sc.nextInt();

// if (number % 2 == 0) {
// sumEven += number;
// } else {
// sumOdd += number;
// }

// System.out.println("do you want to countinue adding? if yes then press 1 if
// no then press 0 :");
// choice = sc.nextInt();
// } while (choice == 1);

// System.out.println("sum of Even numbers is : " + sumEven);
// System.out.println("sum of odd numbers is : " + sumOdd);
// }
// }

// 3. Factorial
// public class Loops {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int number, factorial = 1;
// number = sc.nextInt();
// while (number != 0) {
// factorial *= number;
// --number;
// }

// System.out.println("factorial of the number is :" + factorial);

// }
// }

//4.Multiplication table
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the number for Multiplication Table : ");
        number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}