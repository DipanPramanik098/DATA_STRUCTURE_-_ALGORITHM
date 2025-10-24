// // package Lec45;

// public class _01_Mirror_image {
//     // https://leetcode.com/problems/symmetric-tree/description/

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
//         public boolean isSymmetric(TreeNode root) {
//             if (root == null)
//                 return true; // safe check
//             return Symmetric(root.left, root.right);
//         }

//         public boolean Symmetric(TreeNode root1, TreeNode root2) {
//             if (root1 == null && root2 == null)
//                 return true;
//             if (root1 == null || root2 == null)
//                 return false;
//             if (root1.val != root2.val)
//                 return false;

//             boolean f1 = Symmetric(root1.left, root2.right);
//             boolean f2 = Symmetric(root1.right, root2.left);
//             return f1 && f2;
//         }
//     }

//     public static void main(String[] args) {
//         _01_Mirror_image obj = new _01_Mirror_image();
//         Solution sol = obj.new Solution();

//         // Constructing a symmetric tree:
//         // 1
//         // / \
//         // 2 2
//         // / \ / \
//         // 3 4 4 3

//         TreeNode root = obj.new TreeNode(1);
//         root.left = obj.new TreeNode(2);
//         root.right = obj.new TreeNode(2);
//         root.left.left = obj.new TreeNode(3);
//         root.left.right = obj.new TreeNode(4);
//         root.right.left = obj.new TreeNode(4);
//         root.right.right = obj.new TreeNode(3);

//         System.out.println(sol.isSymmetric(root)); 
//     }
// }
