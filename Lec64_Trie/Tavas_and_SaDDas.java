// // package Lec64_Trie;

// import java.util.Scanner;
// // https://codeforces.com/problemset/problem/535/B
// public class Tavas_and_SaDDas {
//     public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		String str = sc.next();
// 		System.out.println(TavasSaDDas(str));

// 	}

// 	public static int TavasSaDDas(String str) {
// 		int n = str.length();
// 		int count = (1 << n) - 2;
// 		int pos = 0;
// 		for (int i = str.length() - 1; i >= 0; i--) {
// 			if (str.charAt(i) == '7') {
// 				count += (1 << pos);
// 			}
// 			pos++;
// 		}
// 		return count + 1;
// 	}
// }
