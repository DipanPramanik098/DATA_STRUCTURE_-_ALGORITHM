package Lec05_Basic_Math;

public class _02_Decimal_To_Binary {
    public static void main(String[] args) {
        int n = 37;// src base 10
        int sum = 0;
        int mul = 1;
        while (n > 0) {
            int rem = n % 2;// des base 2
            sum = sum + rem * mul;
            mul = mul * 10;
            n = n / 2;
        }
        System.out.println(sum);
    }
}