// // package Lec43;

// import java.util.*;

// public class _04_StringBuilder {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder();// 16
// 		sb.append("hey");
// 		sb.append('a');
// //		System.out.println(sb.capacity());
// 		System.out.println(sb.length());
// 		System.out.println(sb);
// 		sb.append("hellohelloee");
// 		System.out.println(sb.length());
// 		System.out.println(sb);
// 		sb.append("i");
// 		System.out.println(sb.capacity());// new_capacity = Oldcapacity * 2 + 2
// 		// System.out.println(sb.reverse());
// 		// System.out.println(sb.delete(1, 3));
// 		String s = sb.toString();// builder to string
// 		StringBuilder sb1 = new StringBuilder(s);// string to builder
// 		for (int i = 0; i < sb.length(); i++) {
// 			System.out.print(sb.charAt(i) + " ");

// 		}
// 		System.out.println();
//     }
// }
