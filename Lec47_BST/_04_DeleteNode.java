// public class _04_DeleteNode {
//     // https://leetcode.com/problems/delete-node-in-a-bst/description/    

//     public class TreeNode {
//         int val;
//         TreeNode left;
//         TreeNode right;

//         TreeNode() {
//         }

//         TreeNode(int val) {
//             this.val = val;
//         }

//         TreeNode(int val, TreeNode left, TreeNode right) {
//             this.val = val;
//             this.left = left;
//             this.right = right;
//         }
//     }

//     class Solution {
//         public TreeNode deleteNode(TreeNode root, int key) {
//             return delete(root, key);
//         }

//         public TreeNode delete(TreeNode root, int key) {
//             if (root == null) {
//                 return null;
//             }
//             if (root.val < key) {
//                 root.right = delete(root.right, key);

//             } else if (root.val > key) {
//                 root.left = delete(root.left, key);
//             } else {
//                 // 0 or 1child
//                 if (root.left == null) {
//                     return root.right;
//                 } else if (root.right == null) {
//                     return root.left;
//                 } else {
//                     int max = max(root.left);
//                     root.left = delete(root.left, max);
//                     root.val = max;
//                 }

//             }
//             return root;
//         }

//         private int max(TreeNode node) {
//             if (node == null) {
//                 return Integer.MIN_VALUE;
//             }

//             int right = max(node.right);
//             return Math.max(node.val, right);

//         }
//     }
// }
