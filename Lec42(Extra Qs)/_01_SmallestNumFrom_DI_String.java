// // package Lec43;

// // https://leetcode.com/problems/construct-smallest-number-from-di-string/description/

// import java.util.Stack;

// public class _01_SmallestNumFrom_DI_String {
//     public static void main(String[] args) {
//         String qs = "IIIDIDDD";
//         System.out.println(smallestNumber(qs));
//     }    
    
//     public static String smallestNumber(String pattern) {
//         Stack<Integer>st = new Stack<>();
//         int ans [] = new int[pattern.length() + 1];
//         int count = 1;

//         for(int i=0;i<=pattern.length();i++){
//             if(i==pattern.length() || pattern.charAt(i)== 'I'){
//                 ans[i] = count;
//                 count++;
//                 while(!st.isEmpty()){
//                     ans[st.pop()] = count;
//                     count++;
//                 }
//             }else{
//                 st.push(i);
//             }
//         }
//         pattern = "";
//         for(int i=0;  i<ans.length; i++){
//             pattern += ans[i];
//         }
//         return pattern;
//     }
// }
