// // package Lec25_Recursion5;

// public class _01_Maze_Path {
//     public static void main(String[] args) {
//         int n = 4;// row
//         int m = 5;// col
//         System.out.println("\n" + PrintPath(0, 0, n - 1, m - 1, ""));
//     }
    
//     public static int PrintPath(int cc, int cr, int er, int ec, String ans) {
//         if(cr == er && cc == ec) {
//             System.out.println(ans);
//             return 1;
//         }
//         if(cr > er || cc > ec) return 0;
//         int p1 = PrintPath(cc+1, cr, er, ec, ans+'H');
//         int p2 = PrintPath(cc, cr+1, er, ec, ans+'V');
//         return p1+p2;
//     }
// }
