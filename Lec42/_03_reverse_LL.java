// // package Lec42;
// // https://leetcode.com/problems/reverse-linked-list/description/


// public class _03_reverse_LL {
//     public class ListNode {
//         int val;
//         ListNode next;

//         ListNode() {
//         }

//         ListNode(int val) {
//             this.val = val;
//         }

//         ListNode(int val, ListNode next) {
//             this.val = val;
//             this.next = next;
//         }
//     }

//     class Solution {
//         public ListNode reverseList(ListNode head) {
//             ListNode curr = head;
//             ListNode prev = null;
//             while (curr != null) {
//                 ListNode ahead = curr.next;
//                 curr.next = prev;
//                 prev = curr;
//                 curr = ahead;
//             }
//             return prev;

//         }
//     }    

//     public static void main(String[] args) {
//         _03_reverse_LL outer = new _03_reverse_LL();
//         ListNode head = outer.new ListNode(1);
//         head.next = outer.new ListNode(2);
//         head.next.next = outer.new ListNode(3);
//         head.next.next.next = outer.new ListNode(4);
//         head.next.next.next.next = outer.new ListNode(5);

//         Solution sol = outer.new Solution();
//         ListNode reversed = sol.reverseList(head);

//         while (reversed != null) {
//             System.out.print(reversed.val + " ");
//             reversed = reversed.next;
//         }
//         // Output: 5 4 3 2 1
//     }

// }
