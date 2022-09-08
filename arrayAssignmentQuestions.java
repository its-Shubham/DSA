public class arrayAssignmentQuestions {
    // Question 1 1
    public static boolean containsDuplicate(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    // Question 2
    public static void search(int nums[], int target) {
    }

    // Question 3
    public static int maxProfitBuyAndSell(int prices[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > buyPrice) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static int trappedWater(int heights[]) {
        int n = heights.length;

        // left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(heights[i], leftMax[i - 1]);
        }

        // right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
        }

        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            trappedWater += ((Math.min(leftMax[i], rightMax[i])) - heights[i]);
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        // int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        // System.out.println(containsDuplicate(nums));
        // int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        // System.out.println(search(nums, 2));
        // int prices[] = { 7, 1, 5, 3, 6, 4 };
        // System.out.println(maxProfitBuyAndSell(prices));
        int heights[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println(trappedWater(heights));
    }
}
