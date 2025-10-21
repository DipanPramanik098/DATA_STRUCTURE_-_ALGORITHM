
public class _01_Car {

    private String color;
    private int price;
    private int speed;

    // note: Constructor
    public _01_Car(String color, int price, int speed) {
        this.color = color;
        this.price = price;
        this.speed = speed;
    }

    public void Displaycar() {
        System.out.println("c " + this.color + " P " + this.price + " s " + this.speed);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }
    // public void setPrice(int price) throws Exception{
    // if (price < 0) {
    //
    // throw new Exception("Bklol price kabhi -ve nhi hota hai");
    // }
    // this.price = price;
    // }
    
    public void setPrice(int price) {

        try {
            if (price < 0) {

                throw new Exception("Bklol price kabhi -ve nhi hota hai");
            }
            this.price = price;
        }

        catch (Exception e) {
            System.out.println("In catch ");
            // e.printStackTrace();

        }

        finally {
            System.out.println("i am in finaly");
        }

    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Bklol Speed -ve nhi hoga");
            return;
        }
        this.speed = speed;
    }
}

// Note: Access Modifier
// info: Modifier	SameClass SamePackage	Subclass OutsidePackage    
//        public      ✅         ✅           ✅     ✅
//        protected   ✅         ✅           ✅     ❌
//        default     ✅         ✅           ❌     ❌
//        private     ✅         ❌           ❌     ❌
