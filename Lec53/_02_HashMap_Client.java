
// import Lec53._01_My_HashMap;

// package Lec53;

// import Lec53._01_My_HashMap;


public class _02_HashMap_Client {
    public static void main(String[] args) {
        _01_My_HashMap map = new _01_My_HashMap();
        map.put("Kamlesh", 77);
        map.put("Amisha", 69);
        map.put("Raj", 59);
        map.put("Ankit", 67);
        map.put("Puneet", 78);
        map.put("Shivani", 47);
        map.put("Ankit", 167);
        System.out.println(map.containsKey("Shivani"));
        System.out.println(map.containsKey("Shivana"));
        System.out.println(map.get("Ankit"));
        System.out.println(map.get("Ankita"));
        System.out.println(map);
        System.out.println(map.remove("Ankit"));
        System.out.println(map);

    }
}
