// package Lec28_Backtracking2;

public class _01_Coin_Permutation {
    public static void main(String[] args) {
        int[] coin = { 2, 1, 3, 5 };
        int amount = 4;
        Permutation(coin, amount, "");
    }
    public static void Permutation(int [] coin, int amount, String ans){
        if(amount == 0){
            System.out.println(ans);
            return;
        }
        // if(amount < 0){
        //     return;
        // }

        for(int i=0; i<coin.length; i++){
            if(amount>=coin[i]){
                Permutation(coin, amount - coin[i], ans + coin[i]);
            }
        }
    }
}
