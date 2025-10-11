package Lec02_Patterns;

import java.util.Scanner;

public class pattern0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.print("* ");
			i++;
		}
        sc.close();
    }
}
