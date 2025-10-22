// // package Lec43;

// // https://leetcode.com/problems/sort-list/description/

// public class _02_SortList {
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
//         public ListNode sortList(ListNode head) {
//             if (head == null || head.next == null) {
//                 return head;
//             }

//             ListNode mid = mid(head);
//             ListNode headb = mid.next;
//             mid.next = null;
//             ListNode l1 = sortList(head);
//             ListNode l2 = sortList(headb);
//             return mergeTwoLists(l1, l2);

//         }

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

//         public ListNode mid(ListNode head) {
//             ListNode slow = head;
//             ListNode fast = head;
//             while (fast.next != null && fast.next.next != null) {
//                 slow = slow.next;
//                 fast = fast.next.next;

//             }
//             return slow;
//         }
//     }
    
//     public static void main(String[] args) {
//         _02_SortList listObj = new _02_SortList();
//         Solution solution = listObj.new Solution();

//         // Create unsorted list: 4 -> 2 -> 1 -> 3
//         ListNode head = listObj.new ListNode(4);
//         head.next = listObj.new ListNode(2);
//         head.next.next = listObj.new ListNode(1);
//         head.next.next.next = listObj.new ListNode(3);

//         // Sort the list
//         ListNode sortedHead = solution.sortList(head);

//         // Print sorted list
//         while (sortedHead != null) {
//             System.out.print(sortedHead.val + " ");
//             sortedHead = sortedHead.next;
//         }
//     }

// }
