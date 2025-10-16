// // package Lec24_Recursion4;

// public class _02_Permutation {
//     public static void main(String[] args) {
//         String ques = "abc";
//         Printnanswer(ques, "");
//     }    
//     public static void Printnanswer(String qs, String ans){
//         if(qs.length() == 0){
//             System.out.println(ans);
//             return;
//         }

//         for(int i=0;i<qs.length();i++){
//             char ch = qs.charAt(i);
//             String left = qs.substring(0,i);
//             String right = qs.substring(i+1);
//             Printnanswer(left + right, ans+ch);
//         }
//     }
// }
