// package Lec33_Time&Space_Complexity2;

public class _02_Sieve_of_eratosthenis {
    public static void main(String[] args) {
        PrimeSieve(100);
    }

    // ith index pe true hai iska mtlb i prime number hai
    public static void PrimeSieve(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i < prime.length; i++) {
            prime[i] = true;

        }
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i] == true) {// i is Prime number
                for (int j = 2; j * i < prime.length; j++) {
                    prime[i * j] = false;
                }
            }
        }

        for (int i = 2; i < prime.length; i++) {
            if (prime[i] == true) {// i is Prime number
                System.out.print(i + " ");
            }
        }
    }

}
