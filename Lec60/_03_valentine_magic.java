// // 💖 Valentine Magic Problem
// // ------------------------------------------------------------
// // 🎯 Problem Statement:
// // You are given two arrays — `boys[]` and `girls[]`, where
// // each element represents the "magic power" of a boy or girl.
// //
// // Your task is to pair up each boy with exactly one girl such that:
// //   - Each boy is paired with a *distinct* girl.
// //   - The goal is to minimize the *total sum of absolute differences*
// //     in their magic powers.
// //
// // ⚙️ Rules / Notes:
// // - If there are more girls than boys, you may skip some girls.
// // - But every boy must be paired with one girl.
// // - You can pair them in any order, but sorting both arrays helps 
// //   achieve minimum difference due to the greedy nature of pairing
// //   similar strengths together.
// //
// // 💡 Example:
// // Input:
// //   boys  = [2, 11, 3]
// //   girls = [5, 7, 3, 2]
// // Output: 5
// //
// // Explanation:
// //   Sorted boys  = [2, 3, 11]
// //   Sorted girls = [2, 3, 5, 7]
// //   Best pairing → (2,2), (3,3), (11,7)
// //   Total = |2−2| + |3−3| + |11−7| = 0 + 0 + 4 = 4
// // ------------------------------------------------------------

// import java.util.Arrays;

// public class _03_valentine_magic {
//     public static void main(String[] args) {
//         int[] boys = { 2, 11, 3 };
//         int[] girls = { 5, 7, 3, 2 };
//         Arrays.sort(boys);
//         Arrays.sort(girls);

//         int[][] dp = new int[boys.length][girls.length];
//         for (int[] row : dp) {
//             Arrays.fill(row, -1);
//         }

//         System.out.println(MinDiff(boys, girls, 0, 0, dp)); // Output: 4
//     }

//     // 🔁 Recursive + Memoization DP solution
//     public static int MinDiff(int[] boys, int[] girls, int i, int j, int[][] dp) {
//         // Base Case 1: All boys are paired
//         if (i == boys.length) {
//             return 0;
//         }
//         // Base Case 2: No more girls to pair with remaining boys
//         if (j == girls.length) {
//             return 10000000; // large number (infinity)
//         }

//         // Memoization check
//         if (dp[i][j] != -1) {
//             return dp[i][j];
//         }

//         // 💘 Choice 1: Pair current boy with current girl
//         int select = Math.abs(boys[i] - girls[j]) + MinDiff(boys, girls, i + 1, j + 1, dp);

//         // 💔 Choice 2: Skip current girl (try pairing boy with next girl)
//         int reject = MinDiff(boys, girls, i, j + 1, dp);

//         // Store and return the minimum of both choices
//         dp[i][j] = Math.min(select, reject);
//         return dp[i][j];
//     }
// }
