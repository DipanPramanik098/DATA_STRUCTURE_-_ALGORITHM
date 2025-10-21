// public class _06_Reverse_Queue {
//     public static void main(String[] args) throws Exception {
//         _03_MyQueue q = new _03_MyQueue();
//         q.Enqueue(10);
//         q.Enqueue(20);
//         q.Enqueue(30);
//         q.Enqueue(40);
//         q.Enqueue(50);
//         q.Display();
//         Reverse(q);
//         q.Display();
//     }
//     public static void Reverse(_03_MyQueue q) throws Exception {
//         if(q.isEmpty()) return;

//         int value = q.Dequeue();
//         Reverse(q);
//         q.Enqueue(value);
//     }
// }
