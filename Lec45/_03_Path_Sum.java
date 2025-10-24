// // package Lec45;

// import javax.swing.tree.TreeNode;
// // https://leetcode.com/problems/path-sum/
// public class _03_Path_Sum {
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
//     public boolean hasPathSum(TreeNode root, int targetSum) {
//         if (root == null) return false;
        
//         if (root.left == null && root.right == null) {
//             return targetSum == root.val;
//         }
        
//         int remainingSum = targetSum - root.val;
        
//         return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
//     }    
// }
