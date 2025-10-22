public class _03_Client {
    public static void main(String[] args) {

        // note: case 1
        // _01_P obj = new _01_P();
        // System.out.println(obj.d);
        // System.out.println(obj.d1);
        // obj.fun();
        // obj.fun1();

        // // note: case 2
        // _01_P obj = new _02_C();  //example - List<Integer>ll= new ArrayList<>();

        // System.out.println(obj.d);
        // System.out.println(obj.d1);
        // System.out.println(((_02_C) (obj)).d2);
        // System.out.println(((_02_C) (obj)).d);
        // obj.fun();
        // obj.fun1();
        // ((_02_C)(obj)).fun2();

        // note: Case 3

        // C obj = new P();

        // note: case 4
        _02_C obj = new _02_C();
        System.out.println(obj.d);
        System.out.println(((_01_P)(obj)).d);
        System.out.println(obj.d1);// 10
        System.out.println(obj.d2);/// 20
        obj.fun();
        obj.fun2();
        obj.fun1();

    }
}
