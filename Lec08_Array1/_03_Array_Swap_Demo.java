package Lec08_Array1;

public class _03_Array_Swap_Demo {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 5, 7, 8 };
        System.out.println(arr[0] + " " + arr[1]);// 10 20
        Swap(arr[0], arr[1]);
        System.out.println(arr[0] + " " + arr[1]);//

    }

    public static void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);// 20 10
    }
}
