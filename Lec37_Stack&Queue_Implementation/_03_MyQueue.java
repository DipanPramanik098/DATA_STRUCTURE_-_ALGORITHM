public class _03_MyQueue {
    protected int[] arr;
    protected int front = 0;
    private int size = 0;


    public _03_MyQueue() {
		arr = new int[5];
	}

    public _03_MyQueue(int n) {
		arr = new int[n];
	}

    public boolean isEmpty(){
        return size == 0;
    }
    
    public boolean isFull() {
        return size == arr.length;
    }

    public void Enqueue(int item) throws Exception {
        if(isFull()){
            throw new Exception("Queue full hai");
        }
        int index = (front + size) % arr.length;
        // for lenear queue
        // index = front + size
        arr[index] = item;
        size++;
        System.out.println(item + " ADDED in Queue");
    }

    public int Dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Bklol Queue Empty hai");
        }
        int item = arr[front];

        front = (front + 1) % arr.length;
        // for lenear queue
        // front++
        size--;
        return item;
    }

    public int getfront() throws Exception {
        if (isEmpty()) {
            throw new Exception("Bklol Queue Empty hai");
        }
        int rv = arr[front];
        return rv;
    }

    public void Display() {
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % arr.length;
            System.out.print(arr[idx] + " ");

        }
        System.out.println();
    }
}
