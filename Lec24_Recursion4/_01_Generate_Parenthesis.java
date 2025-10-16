// // package Lec24_Recursion4;

// // https://leetcode.com/problems/generate-parentheses/

// import java.util.ArrayList;
// import java.util.List;

// public class _01_Generate_Parenthesis {
//     public static void main(String[] args) {
//         int n = 3;
//         print(n, 0, 0, "");
//         List<String> ans = generateParenthesis(n);
//         System.out.println(ans);
//     }

//     // Simple print version
//     public static void print(int n, int ob, int cb, String ans) {
//         if (ob == n && cb == n) {
//             System.out.println(ans);
//             return;
//         }

//         if (cb < ob) {
//             print(n, ob, cb + 1, ans + ')');
//         }
//         if (ob < n) {
//             print(n, ob + 1, cb, ans + '(');
//         }
//     }

//     // Generate list version
//     public static List<String> generateParenthesis(int n) {
//         List<String> ll = new ArrayList<>();
//         helper(n, 0, 0, "", ll);
//         return ll;
//     }

//     public static void helper(int n, int ob, int cb, String ans, List<String> ll) {
//         if (ob == n && cb == n) {
//             ll.add(ans);
//             return;
//         }

//         if (cb < ob) {
//             helper(n, ob, cb + 1, ans + ')', ll);
//         }
//         if (ob < n) {
//             helper(n, ob + 1, cb, ans + '(', ll);
//         }
//     }
// }
