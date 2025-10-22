// // package Lec42;

// // https://leetcode.com/problems/intersection-of-two-linked-lists/description/

// public class _04_InterSection_of_2_LL {
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

//     public class Solution {
//         public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//             ListNode B = headB;
//             ListNode A = headA;
//             while (A != B) {
//                 if (A == null) {
//                     A = headB;
//                 } else {
//                     A = A.next;
//                 }
//                 if (B == null) {
//                     B = headA;
//                 } else {
//                     B = B.next;
//                 }
//             }
//             return A;

//         }
//     }

//     public static void main(String[] args) {
//         _04_InterSection_of_2_LL outer = new _04_InterSection_of_2_LL();
//         Solution sol = outer.new Solution();

//         // Create common intersection part: 8 → 10
//         ListNode common = outer.new ListNode(8);
//         common.next = outer.new ListNode(10);

//         // Create first linked list: 3 → 7 → 8 → 10
//         ListNode headA = outer.new ListNode(3);
//         headA.next = outer.new ListNode(7);
//         headA.next.next = common; // intersection point

//         // Create second linked list: 99 → 1 → 8 → 10
//         ListNode headB = outer.new ListNode(99);
//         headB.next = outer.new ListNode(1);
//         headB.next.next = common; // intersection point

//         // Find intersection
//         ListNode intersection = sol.getIntersectionNode(headA, headB);

//         if (intersection != null)
//             System.out.println("Intersection Node value: " + intersection.val);
//         else
//             System.out.println("No intersection found.");
//     }
// }
