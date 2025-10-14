// // package Lec17_String;

// public class _06_CompareTo {
//     public static void main(String[] args) {
//         String s1 = "raj";
//         String s2 = "rajesh";
//         // The line `System.out.println(s1.compareTo(s2));` is comparing two strings `s1` and `s2`
//         // lexicographically. It returns an integer value:
//         // - If the two strings are equal, it returns 0.
//         // - If the first string is lexicographically greater than the second string, it returns a
//         // positive value.
//         // - If the first string is lexicographically less than the second string, it returns a
//         // negative value.
//         System.out.println(s1.compareTo(s2));
//         System.out.println(compareTo(s1, s2));

//     }

//     public static int compareTo(String s1, String s2) {
//         if (s1 == s2) {
//             return 0;
//         }
//         for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
//             if (s1.charAt(i) != s2.charAt(i)) {
//                 return s1.charAt(i) - s2.charAt(i);// >0 mtlb s1> s2 ya <0 mtlb s2>s1
//             }
//         }

//         return s1.length() - s2.length();

//     }
// }
