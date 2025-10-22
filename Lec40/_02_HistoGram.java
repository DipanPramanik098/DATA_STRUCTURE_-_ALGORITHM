// // package Lec40;

// // https://leetcode.com/problems/largest-rectangle-in-histogram/description/

// import java.util.Stack;

// public class _02_HistoGram {
//     public static void main(String[] args) {
// 		int[] arr = { 2, 1, 5, 6, 2, 3 };
// 		System.out.println(Area(arr));

// 	}

// 	public static int Area(int[] arr) {
// 		Stack<Integer> st = new Stack<>();
// 		int ans = 0;
// 		for (int i = 0; i < arr.length; i++) {
// 			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
// 				int h = arr[st.pop()];
// 				int r = i;
// 				if (st.isEmpty()) {
// 					int area = h * r;
// 					ans = Math.max(ans, area);
// 				} else {
// 					int l = st.peek();
// 					int area = h * (r - l - 1);
// 					ans = Math.max(ans, area);
// 				}
// 			}
// 			st.push(i);

// 		}
// 		int r = arr.length;
// 		while (!st.isEmpty()) {
// 			int h = arr[st.pop()];

// 			if (st.isEmpty()) {
// 				int area = h * r;
// 				ans = Math.max(ans, area);
// 			} else {
// 				int l = st.peek();
// 				int area = h * (r - l - 1);
// 				ans = Math.max(ans, area);
// 			}
// 		}
// 		return ans;

// 	}
// }
