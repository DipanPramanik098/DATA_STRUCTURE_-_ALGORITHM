// // package Lec43;

// // https://leetcode.com/problems/merge-two-sorted-lists/description/

// public class _01_merge_TWO_sorted_LL {
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
//         public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//             ListNode dummy = new ListNode();
//             ListNode temp = dummy;
//             while (list1 != null && list2 != null) {
//                 if (list1.val < list2.val) {
//                     dummy.next = list1;
//                     dummy = dummy.next;
//                     list1 = list1.next;

//                 } else {
//                     dummy.next = list2;
//                     dummy = dummy.next;
//                     list2 = list2.next;
//                 }

//             }
//             if (list1 == null) {
//                 dummy.next = list2;
//             }
//             if (list2 == null) {
//                 dummy.next = list1;
//             }
//             return temp.next;

//         }
//     }
    
//     public static void main(String[] args) {
//         _01_merge_TWO_sorted_LL listObj = new _01_merge_TWO_sorted_LL();
//         Solution solution = listObj.new Solution();

//         // Create first sorted list: 1 -> 3 -> 5
//         ListNode l1 = listObj.new ListNode(1);
//         l1.next = listObj.new ListNode(3);
//         l1.next.next = listObj.new ListNode(5);

//         // Create second sorted list: 2 -> 4 -> 6
//         ListNode l2 = listObj.new ListNode(2);
//         l2.next = listObj.new ListNode(4);
//         l2.next.next = listObj.new ListNode(6);

//         // Merge lists
//         ListNode merged = solution.mergeTwoLists(l1, l2);

//         // Print merged list
//         while (merged != null) {
//             System.out.print(merged.val + " ");
//             merged = merged.next;
//         }
//     }

// }
