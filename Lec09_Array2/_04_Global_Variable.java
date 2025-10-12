package Lec09_Array2;

public class _04_Global_Variable {
    public static void main(String[] args) {
        System.out.println("hey");
        int x = 60;
        System.out.println(val);
        fun(x);
        System.out.println(val);

    }

    static int val = 100;

    public static void fun(int x) {
        int a = 90;
        System.out.println(a);
        System.out.println(x);
        System.out.println(val);// 100
        // int val = 19; // Removed to avoid hiding the field
        // System.out.println(val);// 19
        _04_Global_Variable.val = 120;
        System.out.println(_04_Global_Variable.val);// 120
    }

}
