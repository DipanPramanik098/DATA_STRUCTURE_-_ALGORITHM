// public class _03_Largest_BST_Subtree {
//     // https://leetcode.ca/all/333.html

//     // https://www.geeksforgeeks.org/problems/largest-bst/1

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
//         public int largestBSTSubtree(TreeNode root) {
//             return solve(root).size;
//         }

//         public BstPair  solve(TreeNode root){
//             if(root == null) return new BstPair();

//             BstPair left = solve(root.left);
//             BstPair right = solve(root.right);
//             BstPair self = new BstPair();
//             self.min =  Math.min(root.val,Math.min(left.min, right.min));
//             self.max =  Math.max(root.val,Math.max(left.max, right.max));
//             self.isBST = left.isBST && right.isBST && root.val > left.max && root.val < right.min;

//             if(self.isBST){
//                 self.size = left.size + right.size + 1;
//             }else{
//                 self.size = Math.max(left.size, right.size);
//             }
//             return self;
//         }

//         public class BstPair{
//             boolean isBST = true;
//             int min = Integer.MAX_VALUE;
//             int max = Integer.MIN_VALUE;
//             int size = 0;
//         }
//     }
// }
