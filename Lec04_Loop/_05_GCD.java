package Lec04_Loop;

public class _05_GCD {
    public static void main(String[] args) {
        int divisor = 36;
        int divident = 60;
        while (divident % divisor != 0) {
            int rem = divident % divisor;
            divident = divisor;
            divisor = rem;

        }

        // for (; divident % divisor != 0;) {
        // int rem = divident % divisor;
        // divident = divisor;
        // divisor = rem;
        //
        // }
        System.out.println(divisor);
    }
}
