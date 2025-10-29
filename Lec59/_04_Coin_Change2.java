// public class _04_Coin_Change2 {
//     // https://leetcode.com/problems/coin-change-ii/description/

//     public static void main(String[] args) {
//         int[] coin = { 1, 2, 5 };
//         int amount = 5;
//         System.out.println(NoofWays(coin, amount, 0));
//     }

//     public static int NoofWays(int[] coin, int amount, int i) {
//         if (amount == 0) {
//             return 1;
//         }
//         if (i == coin.length) {
//             return 0;
//         }

//         int inc = 0;
//         int exc = 0;
//         if (amount >= coin[i]) {
//             inc = NoofWays(coin, amount - coin[i], i);
//         }
//         exc = NoofWays(coin, amount, i + 1);
//         return inc + exc;

//     }

//     public static int NoofWaysBU(int[] coin, int amount) {
//         int[][] dp = new int[coin.length + 1][amount + 1];
//         for (int i = 0; i < dp.length; i++) {
//             dp[i][0] = 1;
//         }

//         for (int c = 1; c < dp[0].length; c++) {
//             for (int am = 1; am < dp.length; am++) {
//                 int inc = 0;
//                 int exc = 0;
//                 if (am >= coin[c - 1]) {
//                     inc = dp[c][am - coin[c - 1]];
//                 }
//                 exc = dp[c - 1][am];
//                 dp[c][am] = inc + exc;
//             }
//         }
//         return dp[dp.length - 1][dp[0].length - 1];

//     }


//     public int change(int amount, int[] coin) {
//         int n = coin.length;
//         int[][] dp = new int[n + 1][amount + 1];

//         // Base case: 1 way to make amount 0 (use no coins)
//         for (int i = 0; i <= n; i++) {
//             dp[i][0] = 1;
//         }

//         // Build the table
//         for (int i = 1; i <= n; i++) {
//             for (int am = 1; am <= amount; am++) {
//                 int inc = 0;
//                 if (am >= coin[i - 1]) {
//                     inc = dp[i][am - coin[i - 1]]; // include current coin
//                 }
//                 int exc = dp[i - 1][am]; // exclude current coin
//                 dp[i][am] = inc + exc;
//             }
//         }

//         return dp[n][amount];
//     }
// }
