// // package Lec61;

// https://leetcode.com/problems/minimum-path-sum/description/

// public class _01_Minimum_Path_Sum {
//     public static void main(String[] args) {
//         int[][] arr = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
//         System.out.println(PathSum(arr, 0, 0));
//     }

//     public static int PathSum(int[][] arr, int cr, int cc) {
//         if (cr == arr.length - 1 && cc == arr[0].length - 1) {
//             return arr[cr][cc];
//         }
//         if (cr >= arr.length || cc >= arr[0].length) {
//             return Integer.MAX_VALUE;
//         }
//         int down = PathSum(arr, cr + 1, cc);
//         int right = PathSum(arr, cr, cc + 1);
//         return Math.min(down, right) + arr[cr][cc];
//     }
// }
