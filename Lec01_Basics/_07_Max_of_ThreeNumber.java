package Lec01_Basics;

public class _07_Max_of_ThreeNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // Approach 1: Using if-else statements
        if (a >= b && a >= c) {
            System.out.println("Maximum number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Maximum number is: " + b);
        } else {
            System.out.println("Maximum number is: " + c);
        }

        // Approach 2: Using Math.max function
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Maximum number using Math.max is: " + max);
    }
}