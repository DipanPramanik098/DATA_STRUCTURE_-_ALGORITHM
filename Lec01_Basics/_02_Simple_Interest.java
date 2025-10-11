package Lec01_Basics;

import java.util.Scanner;

public class _02_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		int si = (p * r * t) / 100;
		System.out.println(si);

        sc.close();
    }
}
