// package Lec30_Backtracking4;

// https://leetcode.com/problems/word-search/description/


public class _02_Word_Search {
    public static void main(String[] args) {
        char[][] maze = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "ABCCED";
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (word.charAt(0) == maze[i][j]) {
                    boolean ans = WordSearch(maze, i, j, word, 0);
                    if (ans == true) {
                        System.out.println(ans);
                        return;
                    }
                }

            }
        }
        System.out.println(false);
    }

    public static boolean WordSearch(char [][] maze, int cr,int cc, String word, int index){
        if(index == word.length()){
            return true;
        }
        if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || word.charAt(index) != maze[cr][cc]) {
            return false;
        }

        // blocked
        maze[cr][cc] = '*';
        // left right top bottom
        int r[] = {0,0,-1,1};
        int c[] = {-1,1,0,0};

        for(int i=0; i<c.length;i++){
            boolean ans = WordSearch(maze, cr+r[i], cc+c[i], word, index+1);
            if(ans){
                return true;
            }
        }
        // undo
        maze[cr][cc] = word.charAt(index);
        return false;


    }
}
