package Lec10_Array3;

import java.util.Arrays;
import java.util.Scanner;

public class _02_Reverse_Range {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
            	arr[i] = sc.nextInt();
            }
            int i = sc.nextInt();
            int j = sc.nextInt();
            Reverse(arr, i, j);
            // System.out.println(arr);
            System.out.println(Arrays.toString(arr));
            for (int k = 0; k < arr.length; k++) {
            	System.out.print(arr[k] + " ");
            }
        }
	}

	public static void Reverse(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}
}
