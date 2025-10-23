// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Scanner;

// public class _01_Binary_Tree{
//     public class Node{
//         int val;
//         Node left;
//         Node right;
//     }

//     Scanner sc = new Scanner(System.in);
//     private Node root;

//     public _01_Binary_Tree(){
//         root = createTree();
//     }

//     private Node createTree(){
//         int item = sc.nextInt();
//         Node nn = new Node();
//         nn.val = item;
//         boolean hlc = sc.nextBoolean();
//         if(hlc){
//             nn.left = createTree();
//         }
//         boolean hrc = sc.nextBoolean();
//         if(hrc){
//             nn.right = createTree();
//         }
//         return nn;
//     }
//     public void DisplayTree(){
//         DisplayTree(root);
//     }
//     private  void DisplayTree(Node root){
//         if(root == null) return;
//         String s = "";
//         s = " <-- " + root.val + " --> ";
//         if(root.left != null){
//             s = root.left.val + s;
//         }else{
//             s = "." + s;
//         }
//         if(root.right != null){
//             s = s + root.right.val;
//         }else{
//             s = s + ".";
//         }
//         System.out.println(s);
//         DisplayTree(root.left);
//         DisplayTree(root.right);
//     }

//     public boolean find(int item){
//         return find(item,this.root);
//     }
//     private boolean find(int item, Node root){
//         if(root == null) return false;
//         if(root.val == item) return true;

//         return find(item, root.left) || find(item, root.right);
//     }


//     public int max() {
//         return max(this.root);
//     }

//     private int max(Node root) {
//         if (root == null)
//             return Integer.MIN_VALUE;

//         int leftMax = max(root.left);
//         int rightMax = max(root.right);

//         return Math.max(root.val, Math.max(leftMax, rightMax));
//     }

//     public int height(){
//         return height(this.root);
//     }
//     private int height(Node root){
//         if(root == null) return 0;

//         return 1 + Math.max(height(root.left), height(root.right));
//     }

//     public void PreOrder() {
//         PreOrder(this.root);
//         System.out.println();
//     }

//     private void PreOrder(Node node) {
//         if (node == null) {
//             return;
//         }
//         System.out.print(node.val + " ");
//         PreOrder(node.left);
//         PreOrder(node.right);

//     }

//     public void POStOrder() {
//         POStOrder(this.root);
//         System.out.println();
//     }

//     private void POStOrder(Node node) {
//         if (node == null) {
//             return;
//         }
//         POStOrder(node.left);
//         POStOrder(node.right);
//         System.out.print(node.val + " ");

//     }

//     public void INOrder() {
//         INOrder(this.root);
//         System.out.println();
//     }

//     private void INOrder(Node node) {
//         if (node == null) {
//             return;
//         }
//         INOrder(node.left);
//         System.out.print(node.val + " ");
//         INOrder(node.right);
//     }

//     public void levelOrder() {
// 		Queue<Node> q = new LinkedList<>();
// 		q.add(root);
// 		while (!q.isEmpty()) {
// 			Node rv = q.poll();// remove first
// 			System.out.print(rv.val + " ");
// 			if (rv.left != null) {
// 				q.add(rv.left);
// 			}
// 			if (rv.right != null) {
// 				q.add(rv.right);
// 			}
// 		}
// 		System.out.println();
// 	}
// }