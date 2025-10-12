package Lec09_Array2;

public class _03_Swap_Demo3 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int[] other = { 100, 200, 300, 400, 600 };
        System.out.println(arr[0] + " " + other[0]);// 10 100
        Swap(arr, other);
        System.out.println("After Swap call -> ");
        System.out.println(arr[0] + " " + other[0]);//
    }

    public static void Swap(int[] arr, int[] other) {
        int[] temp = arr;
        arr = other;
        other = temp;
        System.out.println(arr[0] + " " + other[0]);// 100 10
        System.out.println("Inside Swap");
    }
}
