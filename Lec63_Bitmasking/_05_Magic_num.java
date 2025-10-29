// // package Lec63_Bitmasking;

// public class _05_Magic_num {
//     public static void main(String[] args) {
//         int n = 9;
//         System.out.println(Nthmagicnumber(n));

//     }

//     public static int Nthmagicnumber(int n) {
//         int ans = 0;
//         int mul = 5;
//         while (n > 0) {
//             if ((n & 1) != 0) {
//                 ans = ans + mul;
//             }
//             mul = mul * 5;
//             n = n >> 1;
//         }
//         return ans;
//     }
// }
