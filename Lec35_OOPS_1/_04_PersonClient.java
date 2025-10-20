public class _04_PersonClient {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("hey");
        // Person p1 = new Person();
        _03_Person p = new _03_Person(19, "Smridhi");
        _03_Person p1 = new _03_Person(19, "Mohini");
        p.Intro_yourSelf();

        p1.Fun();
    }
}
