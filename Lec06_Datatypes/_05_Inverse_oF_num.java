package Lec06_Datatypes;

import java.util.Scanner;

public class _05_Inverse_oF_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pos = 1;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			 sum += (sum + pos * Math.pow(10, rem - 1));
			

			pos++;
			n /= 10;// n = n/10;
		}
		System.out.println(sum);
        sc.close();
    }
}
