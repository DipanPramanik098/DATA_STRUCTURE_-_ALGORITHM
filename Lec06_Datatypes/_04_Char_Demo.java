package Lec06_Datatypes;

import java.util.Scanner;

public class _04_Char_Demo {
    public static void main(String[] args) {
        char ch = 'a';
		System.out.println(ch);
		char ch1 = '?';
        try (Scanner sc = new Scanner(System.in)) {
            ch = sc.next().charAt(0);// input
            
            System.out.println(ch);
            System.out.println(ch1);
            System.out.println((int) (ch));
            System.out.println((int) (ch1));
            System.out.println(ch + ch1);
            int x = 19;
            x++;// (int)(x+1)//implicit
            ++ch;// ch = (char)(ch+1)//implicit
            System.out.println(ch);
            ch = (char) (ch + 1);// Explicit
            ch += 1;// ch= (char)(ch+1); //implicit
            System.out.println(ch);
            char g = (char)(ch+ch1);
            System.out.println(g);
            System.out.println(x);
        } // input
    }
}