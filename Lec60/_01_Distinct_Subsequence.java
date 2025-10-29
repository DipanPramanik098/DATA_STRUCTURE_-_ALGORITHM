// import java.util.*;

// class Solution {
//     public int numDistinct(String s, String t) {
//         int[][] dp = new int[s.length()][t.length()];
//         for (int[] row : dp) {
//             Arrays.fill(row, -1);
//         }
//         return distinctSubsequences(s, t, 0, 0, dp);
//     }

//     public static int distinctSubsequences(String s, String t, int i, int j, int[][] dp) {
//         // Base case: If t is fully matched
//         if (j == t.length()) {
//             return 1;
//         }

//         // If s is exhausted but t isn't, no match possible
//         if (i == s.length()) {
//             return 0;
//         }

//         // Check memo table
//         if (dp[i][j] != -1)
//             return dp[i][j];

//         int include = 0, exclude = 0;

//         // If characters match, two options: use it or skip it
//         if (s.charAt(i) == t.charAt(j)) {
//             include = distinctSubsequences(s, t, i + 1, j + 1, dp);
//         }

//         // Always option to skip current s[i]
//         exclude = distinctSubsequences(s, t, i + 1, j, dp);

//         dp[i][j] = include + exclude;
//         return dp[i][j];
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         System.out.println(sol.numDistinct("rabbbit", "rabbit")); // Output: 3
//         System.out.println(sol.numDistinct("babgbag", "bag")); // Output: 5
//     }
// }
