public class _01_Lexico_Counting{
    // https://leetcode.com/problems/lexicographical-numbers/
    public static void main(String[] args) {
        int n = 13;
        printCounting(0, n);
    }
    
    public static void printCounting(int curr, int n) {
        if(curr > n){
            return;
        }
        System.out.println(curr);
        int i = 0;
        if(curr == 0){
            i=1;
        }
        for(; i<=9;i++){
            printCounting(curr*10 +i, n);
        }
    }
}


// import java.util.*;

// class Solution {
//     public static void printCounting(int curr, int n, List<Integer> ll) {
//         if (curr > n) {
//             return;
//         }
//         ll.add(curr); // store number

//         for (int i = 0; i <= 9; i++) {
//             int next = curr * 10 + i;
//             if (next > n)
//                 return;
//             printCounting(next, n, ll);
//         }
//     }

//     public List<Integer> lexicalOrder(int n) {
//         List<Integer> ll = new ArrayList<>();
//         for (int i = 1; i <= 9; i++) {
//             if (i > n)
//                 break;
//             printCounting(i, n, ll);
//         }
//         return ll;
//     }
// }
