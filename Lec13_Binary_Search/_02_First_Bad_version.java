// public class _02_First_Bad_version {
//     // https://leetcode.com/problems/first-bad-version/description/
//     public boolean isBadVersion(int version) {
//         // This is a placeholder for the actual implementation
//         // In practice, this would check if the version is bad
//         // return true; // Assume all versions are bad for this example
//     }

//     public int firstBadVersion(int n) {
//         int left = 1;
//         int right = n;

//         while (left < right) {
//             int mid = left + (right - left) / 2; // Avoid potential overflow

//             if (isBadVersion(mid)) {
//                 right = mid; // Search in the left half
//             } else {
//                 left = mid + 1; // Search in the right half
//             }
//         }
//         return left; // The first bad version
//     }

//     public static void main(String[] args) {

//     }
// }
