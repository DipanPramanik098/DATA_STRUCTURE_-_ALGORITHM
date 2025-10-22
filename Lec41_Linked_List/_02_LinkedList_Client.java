public class _02_LinkedList_Client {
    public static void main(String[] args) throws Exception{
        _01_LinkedList ll = new _01_LinkedList();

        ll.display();
        System.out.println(ll.removefirst());
        ll.addfirst(10);
        ll.addfirst(20);
        ll.display();
        ll.removefirst();
        ll.addlast(220);
        ll.display();
        ll.addlast(50);
        ll.addlast(60);
        ll.addlast(70);
        ll.display();
        System.out.println(ll.getKthNode(2).val);
        System.out.println(ll.getKthNode(4).val);
        // System.out.println(ll.getKthNode(25));

        ll.addAtIndex(99, 2);
        ll.display();

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getAtAnyIndex(4));

        System.out.println("==================");
        System.out.println(ll.removefirst());
        ll.display();
        System.out.println(ll.removelast());
        ll.display();
        System.out.println(ll.removeatindex(2));
        ll.display();
    }
}
