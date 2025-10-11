package Lec01_Basics;

import java.util.Scanner;

public class _06_Loop_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;

        while (i < n) {
            System.out.println("Hello");

            i += 1;// i=i+1;

        }

        sc.close();
    }
}
