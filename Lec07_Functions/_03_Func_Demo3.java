package Lec07_Functions;

public class _03_Func_Demo3 {
    public static void main(String[] args) {
        System.out.println("hey");
        int a = 9;
        int b = 7;
        int ans = Add(a, b);
        System.out.println(ans);// calling)
    }

    public static int Add(int a, int b) {
        int c = a + b;
        System.out.println(Sub(c, a));
        return c;

    }

    public static int Sub(int a, int b) {
        return a - b;

    }
}
