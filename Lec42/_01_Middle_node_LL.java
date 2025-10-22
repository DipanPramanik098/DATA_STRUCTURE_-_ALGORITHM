// public class _01_Middle_node_LL {
//     public static class ListNode {
//         int val;
//         ListNode next;

//         ListNode(int val) {
//             this.val = val;
//         }
//     }

//     static class Solution {
//         public ListNode middleNode(ListNode head) {
//             ListNode slow = head;
//             ListNode fast = head;
//             while (fast != null && fast.next != null) {
//                 slow = slow.next;
//                 fast = fast.next.next;
//             }
//             return slow;
//         }
//     }

//     public static void main(String[] args) {
//         ListNode head = new ListNode(1);
//         head.next = new ListNode(2);
//         head.next.next = new ListNode(3);
//         head.next.next.next = new ListNode(4);
//         head.next.next.next.next = new ListNode(5);

//         Solution sol = new Solution();
//         ListNode mid = sol.middleNode(head);
//         System.out.println("Middle Node: " + mid.val);
//     }
// }
