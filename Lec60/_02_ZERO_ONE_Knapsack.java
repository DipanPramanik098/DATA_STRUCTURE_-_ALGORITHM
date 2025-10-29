// // // package Lec60;

// // public class _02_ZERO_ONE_Knapsack {
// //     public static void main(String[] args) {
// //         int[] wt = { 1, 2, 3, 2, 2 };
// //         int[] val = { 8, 4, 0, 5, 3 };
// //         int cap = 4;
        
// //         System.out.println(maximumvalue(wt, val, cap, 0));

// //     }

// //     public static int maximumvalue(int[] wt, int[] val, int cap, int i) {
// //         if (i == wt.length || cap == 0) {
// //             return 0;
// //         }
// //         int inc = 0;
// //         int exc = 0;
// //         if (cap >= wt[i]) {
// //             inc = val[i] + maximumvalue(wt, val, cap - wt[i], i + 1);
// //         }

// //         exc = maximumvalue(wt, val, cap, i + 1);
// //         return Math.max(inc, exc);

// //     }
// // }


// import java.util.Arrays;

// public class _02_ZERO_ONE_Knapsack {
//     public static void main(String[] args) {
//         int[] wt = { 1, 2, 3, 2, 2 };
//         int[] val = { 8, 4, 0, 5, 3 };
//         int cap = 4;

//         int[][] dp = new int[wt.length][cap + 1];
//         for (int[] row : dp) {
//             Arrays.fill(row, -1);
//         }

//         System.out.println(maximumvalue(wt, val, cap, 0, dp)); // Output: 13
//     }

//     public static int maximumvalue(int[] wt, int[] val, int cap, int i, int[][] dp) {
//         // Base cases
//         if (i == wt.length || cap == 0) {
//             return 0;
//         }

//         // Check if already computed
//         if (dp[i][cap] != -1) {
//             return dp[i][cap];
//         }

//         int include = 0;
//         if (cap >= wt[i]) {
//             include = val[i] + maximumvalue(wt, val, cap - wt[i], i + 1, dp);
//         }

//         int exclude = maximumvalue(wt, val, cap, i + 1, dp);

//         dp[i][cap] = Math.max(include, exclude);
//         return dp[i][cap];
//     }
// }
