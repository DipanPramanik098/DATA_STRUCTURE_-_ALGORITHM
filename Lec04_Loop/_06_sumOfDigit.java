package Lec04_Loop;

import java.util.Scanner;

public class _06_sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n /= 10;// n=n/10;
		}
		System.out.println(sum);
        sc.close();
    }
}
