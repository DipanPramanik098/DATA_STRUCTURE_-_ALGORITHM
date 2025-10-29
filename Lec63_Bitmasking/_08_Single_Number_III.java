// // package Lec63_Bitmasking;
// https://leetcode.com/problems/single-number-iii/
// public class _08_Single_Number_III {
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 1, 3, 2, 5 };
//         int[] a = Single_Number(arr);
//         System.out.println(a[0] + " " + a[1]);
//     }

//     public static int[] Single_Number(int[] arr) {

//         int ans = 0;
//         for (int i = 0; i < arr.length; i++) {
//             ans ^= arr[i];
//         }
//         int mask = (ans & (~(ans - 1)));
//         int a = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if ((arr[i] & mask) != 0) {
//                 a ^= arr[i];
//             }
//         }
//         int b = ans ^ a;
//         int[] ar = { a, b };
//         return ar;
//     }
// }
