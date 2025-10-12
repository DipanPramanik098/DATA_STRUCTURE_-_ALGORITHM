package Lec08_Array1;

import java.util.Scanner;

public class _02_Array_Input {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Dispaly(arr);

            sc.close();
        }
    }

    public static void Dispaly(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

    }
}
