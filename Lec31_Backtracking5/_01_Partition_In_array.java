// // package Lec31_Backtracking5;

// public class _01_Partition_In_array {
//     // public static void main(String[] args) {
//     //     int[] arr = { 5, 7, 2, 3, 8, 1, 4 };
//     //     int idx = Partition(arr, 0, arr.length - 1);
//     //     System.out.println(idx);
//     //     System.out.println("===================");
//     //     for (int i = 0; i < arr.length; i++) {
//     //         System.out.print(arr[i] + " ");
//     //     }
//     // }

//     // public static int Partition(int []arr, int si, int ei){
//     //     int pindex = -1;
//     //     int pval= arr[ei];

//     //     for(int i=si;i<ei;i++){
//     //         if(arr[i] < pval){
//     //             pindex+=1;
//     //             // swap
//     //             int temp = arr[pindex];
//     //             arr[pindex] = arr[i];
//     //             arr[i] = temp;
//     //         }
//     //     }
//     //     // last swap
//     //     pindex+=1;
//     //     int temp = arr[pindex];
//     //     arr[pindex] = arr[ei];
//     //     arr[ei] = temp;

//     //     return pindex;
//     // }


//     // note: same 
//     public static void main(String[] args) {
//         int[] arr = { 5, 7, 2, 3, 8, 1, 4 };
//         int idx = Partition(arr, 0, arr.length - 1);
//         System.out.println(idx);
//         System.out.println("=======");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static int Partition(int[] arr, int si, int ei) {
//         int item = arr[ei];
//         int idx = si;
//         for (int i = si; i < ei; i++) {
//             if (arr[i] <= item) {
//                 int temp = arr[i];
//                 arr[i] = arr[idx];
//                 arr[idx] = temp;
//                 idx++;
//             }

//         }
//         int temp = arr[ei];
//         arr[ei] = arr[idx];
//         arr[idx] = temp;
//         return idx;

//     }
// }
