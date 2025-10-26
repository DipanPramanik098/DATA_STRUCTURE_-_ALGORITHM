public class _02_Heap_Client {
    public static void main(String[] args) {
        _01_Heap hp = new _01_Heap();
        hp.add(10);
        hp.add(20);
        hp.add(30);
        hp.add(5);
        hp.add(7);
        hp.add(3);
        hp.add(2);
        hp.add(-10);
        hp.add(-20);
        hp.Display();
        System.out.println(hp.remove());
        hp.Display();
        System.out.println(hp.min());
        System.out.println(hp.remove());
        hp.Display();

    }
}
