// public class _04_MaxiMUM_Sum_BST_in_BT {
//     // https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/
    
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
//         public int maxSumBST(TreeNode root) {
//             return validbst(root).ans;
//         }

//         public BstPair validbst(TreeNode root) {
//             if(root == null) return new BstPair();

//             BstPair left = validbst(root.left);
//             BstPair right = validbst(root.right);
//             BstPair self = new BstPair();
//             self.min = Math.min(root.val,Math.min(left.min, right.min));
//             self.max = Math.max(root.val,Math.max(left.max, right.max));
//             self.isBST = left.isBST && right.isBST && root.val > left.max && root.val <
//             right.min;

//             self.sum = root.val + left.sum + right.sum;

//             if(self.isBST){
//                 self.ans = Math.max(self.sum , Math.max(left.ans, right.ans));
//             }else{
//                 self.ans = Math.max(left.ans, right.ans);
//             }
//             return self;
//         }
//     }

//     class BstPair {
//         boolean isBST = true;
//         long min = Long.MAX_VALUE;
//         long max = Long.MIN_VALUE;
//         int sum = 0;// saare node ka sum
//         int ans = 0;// bst part ka sum

//     }
// }
