// // package Lec22_Recusion2;

// public class _02_Fact_Tail {
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fact(n, 1)); // Output: 120
//     }

//     // Tail recursive factorial
//     public static int fact(int n, int ans) {
//         // Base case
//         if (n == 0) {
//             return ans; // when n reaches 0, return the accumulated result
//         }

//         // Recursive call (tail recursion)
//         return fact(n - 1, ans * n);
//     }
// }
