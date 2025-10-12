package Lec05_Basic_Math;

public class _01_BinaryToDecimal {
    public static void main(String[] args) {
        int n = 101101;// src base 2
        int sum = 0;
        int mul = 1;
        while (n > 0) {
            int rem = n % 10;// des base 10
            sum = sum + rem * mul;
            mul = mul * 2;
            n = n / 10;
        }
        System.out.println(sum);
    }
}