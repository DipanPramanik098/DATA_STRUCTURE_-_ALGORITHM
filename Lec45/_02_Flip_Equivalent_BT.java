// // package Lec45;

// public class _02_Flip_Equivalent_BT {
//     // https://leetcode.com/problems/flip-equivalent-binary-trees/description/

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
//         public boolean flipEquiv(TreeNode root1, TreeNode root2) {
//             return Equiv(root1, root2);
//         }

//         public boolean Equiv(TreeNode root1, TreeNode root2) {
//             if (root1 == null && root2 == null)
//                 return true;
//             if (root1 == null || root2 == null)
//                 return false;
//             if (root1.val != root2.val)
//                 return false;

//             boolean flip = Equiv(root1.left, root2.right) && Equiv(root1.right, root2.left);
//             boolean noflip = Equiv(root1.left, root2.left) && Equiv(root1.right, root2.right);
//             return flip || noflip;
//         }
//     }

//     public static void main(String[] args) {
//         _02_Flip_Equivalent_BT obj = new _02_Flip_Equivalent_BT();
//         Solution sol = obj.new Solution();

//         // Construct Tree 1
//         // 1
//         // / \
//         // 2 3
//         // / \
//         // 4 5
//         // / \
//         // 7 8
//         TreeNode root1 = obj.new TreeNode(1);
//         root1.left = obj.new TreeNode(2);
//         root1.right = obj.new TreeNode(3);
//         root1.left.left = obj.new TreeNode(4);
//         root1.left.right = obj.new TreeNode(5);
//         root1.left.right.left = obj.new TreeNode(7);
//         root1.left.right.right = obj.new TreeNode(8);

//         // Construct Tree 2 (flip equivalent)
//         // 1
//         // / \
//         // 3 2
//         // / \
//         // 4 5
//         // / \
//         // 8 7
//         TreeNode root2 = obj.new TreeNode(1);
//         root2.left = obj.new TreeNode(3);
//         root2.right = obj.new TreeNode(2);
//         root2.right.left = obj.new TreeNode(4);
//         root2.right.right = obj.new TreeNode(5);
//         root2.right.right.left = obj.new TreeNode(8);
//         root2.right.right.right = obj.new TreeNode(7);

//         // Test output
//         System.out.println(sol.flipEquiv(root1, root2)); 
//     }
// }
