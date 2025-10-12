package Lec08_Array1;

public class _04_Array_Swap_Demo2 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 5, 7, 8 };
        System.out.println(arr[0] + " " + arr[1]);// 10 20
        Swap(arr, 0, 1);
        System.out.println(arr[0] + " " + arr[1]);//
    }

    public static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
