// package Lec33_Time&Space_Complexity2;

public class _01_Check_Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(69));

    }

    public static boolean isPrime(int n) {
        int div = 2;
        while (div * div <= n) {
            if (n % div == 0) {
                return false;
            }
            div++;
        }
        return true;

    }
}
