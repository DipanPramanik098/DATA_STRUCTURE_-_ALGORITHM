package Lec01_Basics;

import java.util.Scanner;

public class _08_Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n > 6) {
			System.out.println("Hello");
		}
		if (n % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("odd");
		}

		sc.close();
    }
}
