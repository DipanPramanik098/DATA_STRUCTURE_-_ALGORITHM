package Lec07_Functions;

import java.util.Scanner;

public class _04_Armstrong_Number {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(Is_Armstrong_Number(n));
        }
	}

	public static boolean Is_Armstrong_Number(int n) {
		int d = Countofdigit(n);
		int sum = 0;
		int p = n;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, d));// TypCasting
			n = n / 10;
		}
        return sum == p;

	}

	public static int Countofdigit(int n) {

		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}
}
