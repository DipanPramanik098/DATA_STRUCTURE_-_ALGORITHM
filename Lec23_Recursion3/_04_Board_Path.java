// package Lec23_Recursion3;

// public class _04_Board_Path {
//     public static void main(String[] args) {
//         int target = 4;
//         path(target, "");
//     }
//     public static void path(int target, String ans){
//         if(target == 0){
//             System.out.println(ans);
//             return;
//         }
//         if(target < 0) return;
        
//         for(int dice =1; dice <=3; dice++){
//             path(target - dice, ans + dice);
//         }
//     }
// }
