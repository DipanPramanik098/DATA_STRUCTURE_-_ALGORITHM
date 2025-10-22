
public class _01_LinkedList {

    public class Node {

        int val;
        Node next;
    }

    private Node head;// 1st Node of LinkedList
    private int size;// number of node
    private Node tail;// last Node of LinkedList
    // O(1)

    public void addfirst(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }
        size++;
        System.out.println(item + " Added Successfully at Start");
    }

    // O(1)
    public void addlast(int item) {
        Node nn = new Node();
        nn.val = item;

        if (size == 0) {
            head = tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
        size++;
        System.out.println(item + " Added Successfully at End");
    }

    public Node getKthNode(int index) throws Exception {
        if ((index >= size) || (index < 0)) {
            throw new Exception("Out Of Range");
        }
        Node temp = head;
        while (index > 0) {
            temp = temp.next;
            index--;
        }
        return temp;
    }

    public void addAtIndex(int item, int index) throws Exception {
        if ((index >= size) || (index < 0)) {
            System.out.println("Invalid Index");
        } else if (index == 0) {
            addfirst(item);
        } else if (index == size) {
            addlast(item);
        } else {
            Node temp = getKthNode(index - 1);
            Node nn = new Node();
            nn.val = item;
            nn.next = temp.next;
            temp.next = nn;
            size++;
        }
    }

    public int getFirst() throws Exception {
        if (head == null) {
            throw new Exception("Bklol list empty hai");
        }
        return head.val;
    }

    public int getLast() throws Exception {
        if (head == null) {
            throw new Exception("Bklol list empty hai");
        }
        return tail.val;
    }

    public int getAtAnyIndex(int index) throws Exception {
        return getKthNode(index).val;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Bklol kuch Daal to pehle fir print karega");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        // for the last element just for better understanding
        System.out.println(temp.val);
        System.out.println();
    }

    // O(1)
    public int removefirst() {
        if (size == 0) {
            System.out.println("Bklol Empty Hai abhi ");
            return -1;
        }
        if (size == 1) {
            int data = head.val;
            head = tail = null;
            size--;
            System.out.println(data + " deleted from start");
            return data;
        }
        int data = head.val;
        head = head.next;
        size--;
        return data;
    }

    public int removelast() throws Exception {
        if (size == 1) {
            return removefirst();
        } else {
            Node prev = getKthNode(size - 2);
            int data = tail.val;
            tail = prev;
            tail.next = null;
            size--;
            return data;

        }
    }

    public int removeatindex(int k) throws Exception {
        if (k == 0) {
            return removefirst();
        } else if (k == size - 1) {
            return removelast();
        } else {
            Node prev = getKthNode(k - 1);
            Node curr = prev.next; // GetNode(k);
            prev.next = curr.next;
            curr.next = null;
            size--;
            return curr.val;
        }

    }
}
