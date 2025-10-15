// // package Lec22_Recusion2;

// public class _04_SubSequence {
//     public static void main(String[] args) {
//         String ques = "abc";
//         String ans = "";
//         PrintSubSeqnue(ques, ans);

//     }

//     public static void PrintSubSeqnue(String ques, String ans) {
//         if (ques.length() == 0) {
//             System.out.print(ans + " ");
//             return;
//         }

//         char ch = ques.charAt(0);
//         PrintSubSeqnue(ques.substring(1), ans);
//         PrintSubSeqnue(ques.substring(1), ans + ch);

//     }
// }
