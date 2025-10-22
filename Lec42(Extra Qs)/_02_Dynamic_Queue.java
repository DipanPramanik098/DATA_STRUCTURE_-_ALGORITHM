// // package Lec43;

// public class _02_Dynamic_Queue extends _03_MyQueue {
//     @Override
//     public void Enqueue(int item) throws Exception{
//         if(isFull()){
//             int newArr[] = new int [arr.length *2];

//             for(int i=0; i<arr.length;i++){
//                 int idx = (front + 1)% arr.length;
//                 newArr[i] = arr[idx];
//             }
//             arr = newArr;
//         }
//         super.Enqueue(item);
//     }
// }
