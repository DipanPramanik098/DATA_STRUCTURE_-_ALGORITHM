public class _03_Person {
    String name = "Anish";
    int age = 22;

    public void Intro_yourSelf() {

        System.out.println("My Name is " + name + " and age is " + age);
    }

    public void Fun() {
        System.out.println("Hey fun");
    }

    public _03_Person() {

	}

    public _03_Person(int age, String name) {
		this.age = age;
		this.name = name;

	}

    public static void main(String[] args) {
        _03_Person p = new _03_Person(78, "Raj");
        p.Intro_yourSelf();
    }
}
