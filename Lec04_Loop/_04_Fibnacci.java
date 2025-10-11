package Lec04_Loop;

import java.util.Scanner;

public class _04_Fibnacci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a = 0;
            int b = 1;
            for (int i = 1; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
                
            }
            System.out.println(a);
        }
    }
}
