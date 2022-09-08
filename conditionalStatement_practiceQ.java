import java.util.*;

// 1.
// public class conditionalStatement_practiceQ {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// float num = sc.nextFloat();
// if (num>=0){
// System.out.println("Positive");
// } else {
// System.out.println("Negative");
// }
// }
// }

// 2.
// public class conditionalStatement_practiceQ {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// double temp = 103.5;
// if(temp>100){
// System.out.println("You have a fever");
// } else{
// System.out.println("You don't have a fever");
// }
// }
// }

// 3.
// public class conditionalStatement_practiceQ {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int weekNum = sc.nextInt();
// switch (weekNum) {
// case 1:
// System.out.println("Monday");
// break;
// case 2:
// System.out.println("Tuesday");
// break;
// case 3:
// System.out.println("Wednesday");
// break;
// case 4:
// System.out.println("Thursday");
// break;
// case 5:
// System.out.println("Friday");
// break;
// case 6:
// System.out.println("Saturday");
// break;
// case 7:
// System.out.println("Sunday");
// break;
// default:
// System.out.println("Such Week doesn't Exist on Earth's Calander, kindly enter
// week number between 1-7");
// }
// }
// }

// 5.
// public class conditionalStatement_practiceQ {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();
//         if (year % 4 == 0) {
//             if (year % 100 == 0) {
//                 if (year % 400 == 0) {
//                     System.out.println("Leap Year");
//                 } else {
//                     System.out.println("Not Leap Year");
//                 }
//             } else {
//                 System.out.println("Leap Year");
//             }
//         } else {
//             System.out.println("Not Leap Year");
//         }
//     }
// }

//-------------------or------------------------------

public class conditionalStatement_practiceQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = (year % 400) == 0;

        if (x && (y || z)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }
    }
}