// // package Lec42;

// // https://leetcode.com/problems/linked-list-cycle/description/

// note: Floyed Cycle Detection ALgorithm
// public class _02_LL_Cycle {

//     public static class ListNode {

//         int val;
//         ListNode next;

//         ListNode(int val) {
//             this.val = val;
//         }
//     }

//     public static class Solution {

//         public boolean hasCycle(ListNode head) {
//             ListNode slow = head;
//             ListNode fast = head;
//             while (fast != null && fast.next != null) {
//                 slow = slow.next;
//                 fast = fast.next.next;
//                 if (slow == fast) {
//                     return true;
//                 }
//             }
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         // Create nodes
//         ListNode a = new ListNode(3);
//         ListNode b = new ListNode(2);
//         ListNode c = new ListNode(0);
//         ListNode d = new ListNode(-4);

//         // Connect nodes (creating a cycle: tail connects to node b)
//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = b;

//         Solution sol = new Solution();
//         System.out.println(sol.hasCycle(a)); // Output: true
//     }
// }
