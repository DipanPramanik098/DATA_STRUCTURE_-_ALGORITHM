import java.util.Stack;

public class _05_Insert_bottom_in_Stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Insert_Buttom(st, -9);
		System.out.println(st);
    }    

    public static void Insert_Buttom(Stack<Integer>st, int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        int val = st.pop();
        Insert_Buttom(st, item);
        st.push(val);
    }
}
