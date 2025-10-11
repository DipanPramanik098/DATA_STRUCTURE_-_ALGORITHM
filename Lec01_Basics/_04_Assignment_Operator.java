package Lec01_Basics;

public class _04_Assignment_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Assignment operator
        a += b; // a = a + b
        System.out.println("a += b: " + a); // 30

        a -= b; // a = a - b
        System.out.println("a -= b: " + a); // 10

        a *= b; // a = a * b
        System.out.println("a *= b: " + a); // 200

        a /= b; // a = a / b
        System.out.println("a /= b: " + a); // 10

        a %= b; // a = a % b
        System.out.println("a %= b: " + a); // 10
    }
}