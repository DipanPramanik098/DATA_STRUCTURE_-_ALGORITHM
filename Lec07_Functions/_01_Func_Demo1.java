package Lec07_Functions;

public class _01_Func_Demo1 {
    public static void main(String[] args) {
        System.out.println("hey");
        int a = 9;
        int b = 7;
        int c = a + b;
        Add();// calling
        System.out.println(c);

    }

    public static void Add() {

        int a = 11;
        int b = 17;
        int c = a + b;
        Sub();
        System.out.println(c);

    }

    public static void Sub() {

        int a = 11;
        int b = 17;
        int c = a - b;
        Add();
        System.out.println(c);

    }
}