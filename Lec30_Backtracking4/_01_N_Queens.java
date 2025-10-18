// // package Lec30_Backtracking4;

// public class _01_N_Queens {
//     public static void main(String[] args) {
//         int n = 4;
//         boolean[][] board = new boolean[n][n];
//         Queen(board, 0, n);
//     }

//     public static void Queen(boolean b[][], int row, int tq){
//         if(tq == 0){
//             Display(b);
//             return;
//         }
//         for(int col=0;col<b.length;col++){
//             if(isSafe(b,row,col)){
//                 b[row][col] = true;
//                 Queen(b, row+1, tq-1);
//                 b[row][col]=false;
//             }
//         }
//     }

//     public static boolean isSafe(boolean [][]b, int row, int col){
//         // top
//         int r = row;
//         while(r>=0){
//             if(b[r][col]!=false) return false;
//             r--;
//         }
//         // left
//         r=row;
//         int c = col;
//         while(c >= 0){
//             if (b[r][c] != false)
//                 return false;
//             c--;
//         }
//         // top left diagonal
//         c = col;
//         r = row;

//         while(r>=0 && c>=0){
//             if(b[r][c] != false) return false;
//             r--;
//             c--;
//         }

//         // right diagonal

//         r = row;
//         c = col;
//         while (r >= 0 && c < b.length) {
//             if (b[r][c]) {
//                 return false;
//             }
//             r--;
//             c++;
//         }

//         return true;
//     }


//     public static void Display(boolean[][] board) {
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println();

//     }
// }
