package Lec09_Array2;

public class _01_Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, -4, 7, 11 };
        int item = 4;
        System.out.println(Search(arr, item));

    }

    public static int Search(int[] arr, int item) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;

    }
}
