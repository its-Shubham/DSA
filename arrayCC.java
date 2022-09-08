
// import java.util.*;

// // linear search
// public class arrayCC {
//     public static int linear_search(int num[], int key) {
//         for (int i = 0; i < num.length; i++) {
//             if (num[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//         int key = 10;
//         int index = linear_search(number, key);
//         if (index == -1) {
//             System.out.println("NOT FOUND");
//         } else {
//             System.out.println("key is at index : " + index);
//         }
//     }
// }

// public class arrayCC {
//     // largest value
//     public static int largest(int numbers[]) {
//         int largest = Integer.MIN_VALUE;

//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] > largest) {
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }

//     // binary search
//     public static int binarySearch(int numbers[], int key) {
//         int start = 0, end = numbers.length - 1;

//         while (start <= end) {
//             int mid = (start + end) / 2;

//             if (numbers[mid] == key) {
//                 return mid;
//             }
//             if (numbers[mid] < key) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }

//         return -1;
//     }

//     // reverse the array
//     public static void reverseArray(int numbers[]) {
//         int temp = 0;
//         int first = 0, last = numbers.length - 1;
//         while (first < last) {
//             temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;
//             first++;
//             last--;
//         }
//     }

//     // print pairs in array
//     public static void printPairs(int numbers[]) {
//         int tp = 0;
//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i + 1; j < numbers.length; j++) {
//                 System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println(tp);
//     }

//     // print subarrays
//     public static void printSubarrays(int numbers[]) {
//         int ts = 0;
//         for (int i = 0; i < numbers.length; i++) {

//             for (int j = i; j < numbers.length; j++) {

//                 for (int k = i; k <= j; k++) {
//                     System.out.print(numbers[k] + " ");
//                 }
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println(ts);
//     }

//     // sum of subarrays and then finding maximum and minimum sum of subarrays
//     // (MY VERSION)-> Bad time and space complexity
//     public static void sumSubarrays(int numbers[]) {
//         int sumArray[] = new int[numbers.length];
//         int maximum = Integer.MIN_VALUE;
//         int minimum = Integer.MAX_VALUE;

//         for (int i = 0; i < numbers.length; i++) {

//             for (int j = i; j < numbers.length; j++) {

//                 for (int k = i; k <= j; k++) {
//                     System.out.print(numbers[k] + " "); // printing
//                     sumArray[i] = sumArray[i] + numbers[k]; // sum of subarrays
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }

//         // maximum and minimum of sum of subarrays
//         for (int i = 0; i < sumArray.length; i++) {
//             if (sumArray[i] > maximum) {
//                 maximum = sumArray[i];
//             }
//             if (sumArray[i] < minimum) {
//                 minimum = sumArray[i];
//             }
//         }

//         System.out.println("maximum sum of subarrays is : " + maximum);
//         System.out.println("minimum sum of subarrays is : " + minimum);
//     }

//     // Max-Subarray Sum-I (Brute Force)
//     public static void maxSubarrayB(int numbers[]) {
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;
//         for (int i = 0; i < numbers.length; i++) {

//             for (int j = i; j < numbers.length; j++) {
//                 currSum = 0;
//                 for (int k = i; k <= j; k++) {
//                     currSum = currSum + numbers[k];
//                 }
//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }

//         }
//         System.out.println("max sum is : " + maxSum);
//     }

//     // Max Subarray Sum-II (Prefix Sum)
//     public static void maxSubarrayPrefix(int numbers[]) {
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;
//         int prefix[] = new int[numbers.length];

//         prefix[0] = numbers[0];
//         // calculate prefix array
//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i - 1] + numbers[i];
//         }

//         for (int i = 0; i < numbers.length; i++) {
//             int start = i;
//             for (int j = i; j < numbers.length; j++) {
//                 int end = j;

//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }

//         }
//         System.out.println("max sum is : " + maxSum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 1, -2, 6, -1, 3 };
//         int key = 4;
//         // System.out.println("largest number is : " + largest(numbers));
//         // System.out.println("the number " + key + " is present at " +
//         // binarySearch(numbers, key));
//         // reverseArray(numbers);
//         // for (int i = 0; i < numbers.length; i++) {
//         // System.out.print(numbers[i] + " ");
//         // }
//         // printPairs(numbers);
//         // printSubarrays(numbers);
//         // sumSubarrays(numbers);
//         // maxSubarrayB(numbers);
//         maxSubarrayPrefix(numbers);
//     }
// }

// public class arrayCC {
//     // Kadan's Algorithm
//     // Max Subarray Sum-II (kadan's algorithm)-> very optimised -> T.C = O(n)
//     public static void kadans(int numbers[]) {
//         int cs = 0, ms = Integer.MIN_VALUE;

//         for (int i = 0; i < numbers.length; i++) {
//             cs = cs + numbers[i];
//             if (cs < 0) {
//                 cs = 0;
//             }
//             ms = Math.max(ms, cs);
//         }
//         System.out.println("max subarray sum is : " + ms);
//     }

// kadans algorithm with all negative elements
//     public static void kadansNegativemax(int numbers[]) {
//         int cs = 0, ms = Integer.MIN_VALUE;
//         boolean allNeg = true;

//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] > 0) {
//                 allNeg = false;
//             }
//             if (allNeg = false) {
//                 cs = cs + numbers[i];
//                 if (cs < 0) {                                                                    //not working
//                     cs = 0;
//                 }
//                 ms = Math.max(ms, cs);
//             } else {

//             }
//         }

//         System.out.println("max subarray sum is : " + ms);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
//         // kadans(numbers);
//     }
// }

// public class arrayCC {
//     // rainwater level problem
//     public static int trappedRainwater(int height[]) {
//         int n = height.length;

//         // left max boundary
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for (int i = 1; i < n; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//         }

//         // right max boundary
//         int rightmax[] = new int[n];
//         rightmax[n - 1] = height[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightmax[i] = Math.max(height[i], rightmax[i + 1]);
//         }

//         int trappedWater = 0;
//         // loop
//         for (int i = 0; i < n; i++) {
//             // waterLevel = min(leftmsx bound, rightmax bound)
//             int waterLevel = Math.min(leftMax[i], rightmax[i]);

//             // trapped water = waterLevel - height[i]
//             trappedWater += waterLevel - height[i];
//         }

//         return trappedWater;
//     }

//     public static void main(String[] args) {
//         int height[] = { 4, 2, 0, 6, 3, 2, 5 };
//         System.out.println(trappedRainwater(height));
//     }
// }

public class arrayCC {

    public static int buyAndSellStocks(int prices[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            // profit = sellPrice - buyPrice
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(prices));
    }
}