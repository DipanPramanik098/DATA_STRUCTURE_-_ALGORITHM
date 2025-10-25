// public class _03_Insert_into_BST {
//     // https://leetcode.com/problems/insert-into-a-binary-search-tree/description/

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
//         public TreeNode insertIntoBST(TreeNode root, int val) {
//             return insert(root, val);
//         }

//         public TreeNode insert(TreeNode root, int val) {
//             if (root == null) {
//                 return new TreeNode(val);
//             }

//             if (root.val < val) {
//                 root.right = insert(root.right, val);
//             } else {
//                 root.left = insert(root.left, val);
//             }
//             return root;

//         }
//     }
// }
