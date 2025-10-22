public class _07_DynamicStak_Client {
    public static void main(String[] args) throws Exception {
        _06_Dynamic_Stack ds = new _06_Dynamic_Stack();
        ds.push(10);
        ds.push(20);
        ds.push(30);
        ds.push(40);
        ds.push(50);
        ds.push(60);
        ds.Dispaly();
        System.out.println(ds.peek());
    }
}
