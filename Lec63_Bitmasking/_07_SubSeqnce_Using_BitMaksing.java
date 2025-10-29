// // package Lec63_Bitmasking;

// public class _07_SubSeqnce_Using_BitMaksing {
//     public static void main(String[] args) {
//         String s = "abc";
//         printSubSeqnce(s);

//     }

//     public static void printSubSeqnce(String s) {
//         int n = s.length();
//         for (int i = 0; i < (1 << n); i++) {
//             Pattern(s, i);
//         }

//     }

//     private static void Pattern(String s, int i) {
//         int pos = 0;
//         while (i > 0) {
//             if ((i & 1) != 0) {
//                 System.out.print(s.charAt(pos));
//             }
//             i >>= 1;
//             pos++;
//         }
//         System.out.println();

//     }
// }
