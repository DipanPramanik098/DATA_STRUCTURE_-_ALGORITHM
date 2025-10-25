// public class _02_Validate_BST {
//     // https://leetcode.com/problems/validate-binary-search-tree/description/
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
//         public boolean isValidBST(TreeNode root) {
//             return validateBST(root).isValid;
//         }
//         public BstPair validateBST(TreeNode root){
//             if(root == null) return  new BstPair();

//             BstPair left = validateBST(root.left);
//             BstPair right = validateBST(root.right);
//             BstPair self = new BstPair();
//             self.min = Math.min(root.val, Math.min(left.min,right.min));
//             self.max = Math.max(root.val, Math.max(left.max,right.max));
//             self.isValid = left.isValid && right.isValid && root.val > left.max && root.val < right.min;

//             return self;
//         }
        
//         class BstPair {
//             boolean isValid = true;
//             long min = Long.MAX_VALUE;
//             long max = Long.MIN_VALUE;
//         }
//     }

// }
