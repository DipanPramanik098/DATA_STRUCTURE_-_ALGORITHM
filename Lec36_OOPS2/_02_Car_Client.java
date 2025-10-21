public class _02_Car_Client {
    public static void main(String[] args) throws Exception {
        _01_Car c = new _01_Car("black", 20000000, 300);
        _01_Car c1 = new _01_Car("Red", 19029, 23);

        c.Displaycar();
        c1.Displaycar();
        c.setColor("Green");
        c.setPrice(-1000);
        c.Displaycar();
        System.out.println("hey");
        // System.out.println(c.getColor());
        // System.out.println(c1.getPrice());
        // System.out.println(c.getSpeed());

        
    } 
}
