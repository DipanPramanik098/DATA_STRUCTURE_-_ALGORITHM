// import java.util.Scanner;

import java.util.ArrayList;

public class _02_StudentClient{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        //     s-> reference variable          _01_Student() -> instance/object
        ArrayList<Integer> ll = new ArrayList<>();
//		ll.add(10);
//		ArrayList<Integer> ll1 = new ArrayList<>();
//		ll1.add(5);
		System.out.println("Hey Bhai log");
		_01_Student s = new _01_Student();
		s.name = "Mohini";
		s.age = 20;
		s.Intro_yourSelf();
		_01_Student s1 = new _01_Student();
		s1.name = "Hunir";
		s1.age = 25;
		s1.Intro_yourSelf();
		s1.SayHey("Raja");
		s.SayHey("Raja");
		_01_Student.fun();
		s.fun();
		s1.fun();

    }
}