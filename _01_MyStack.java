public class _01_MyStack {
    protected  int arr[];
    protected int top = -1;

    public _01_MyStack() {
		arr = new int[5];
	}

    public _01_MyStack(int n) {
		arr = new int[n];
	}

    public boolean isFull(){
        return top == arr.length-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Stack is full");
        }
        top++;
        arr[top] = item;
        System.out.println(item +" added in the stack");
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int item = arr[top];
        top--;
        return item;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Bklol Stack Empty hai ");
        }
        int rv = arr[top];

        return rv;
    }

    public int size() {
        return top + 1;
    }

    public void Dispaly() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
