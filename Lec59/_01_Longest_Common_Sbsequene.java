// import java.util.*;
// public class _01_Longest_Common_Sbsequene{
//     // https://leetcode.com/problems/longest-common-subsequence/description/
//     public static int longestCommonSubsequence(String text1, String text2) {
//         int dp[][] = new int[text1.length()][text2.length()];
//         for(int [] a : dp){
//             Arrays.fill(a, -1);
//         }
//         return lcs(text1,text2,0,0, dp);
//     }
//     public static int lcs(String s1, String s2,int i, int j, int dp[][]) {
//         if(i==s1.length() || j == s2.length()) return 0;
//         if(dp[i][j] != -1) return dp[i][j];
//         int ans=0;
//         if(s1.charAt(i) == s2.charAt(j)){
//             ans =1 + lcs(s1,s2, i+1, j+1,dp);
//         }else{
//             ans = Math.max(lcs(s1,s2,i+1, j,dp), lcs(s1,s2,i,j+1,dp));
//         }
//         dp[i][j] = ans;
//         return ans;
//     }


//     public static int lcsBU(String s1, String s2) {
//         int[][] dp = new int[s1.length() + 1][s2.length() + 1];
//         for (int i = 1; i < dp.length; i++) {
//             for (int j = 1; j < dp[0].length; j++) {
//                 int ans = 0;
//                 if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
//                     ans = 1 + dp[i - 1][j - 1];
//                 } else {
//                     int a = dp[i - 1][j];
//                     int b = dp[i][j - 1];
//                     ans = Math.max(a, b);
//                 }
//                 dp[i][j] = ans;

//             }
//         }
//         return dp[dp.length - 1][dp[0].length - 1];

//     }
    
//     public static void main(String[] args) {
//         String s1 = "abcde";
//         String s2 = "ce";
//         System.out.println(longestCommonSubsequence(s1,s2));
//     }
// }