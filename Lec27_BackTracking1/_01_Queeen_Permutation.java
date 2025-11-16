// package Lec27_BackTracking1;

public class _01_Queeen_Permutation {
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;// total queen
        boolean[] board = new boolean[n];
        permutation(board, tq, 0, "");
    }    
    
    public static void permutation(boolean[] board, int tq, int qpsf, String ans) {
        if (qpsf == tq){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(board[i] == false){
                board[i] = true; 
                permutation(board, tq, qpsf+1, ans + " q"+qpsf + "_b"+ i);
                board[i] = false; //backtrack
            }
        }
    }
}
