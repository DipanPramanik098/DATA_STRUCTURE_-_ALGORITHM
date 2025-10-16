// package Lec25_Recursion5;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

public class _02_Key_PAid {
    static String[] code = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void main(String[] args) {
        String ques = "23";
		List<String> ll = new ArrayList<>();
		Printanswer(ques, "", ll);
		System.out.println(ll);
    }
    
    public static void Printanswer(String ques, String ans, List<String> ll) {
        if(ques.length()==0){
            ll.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String press = code[ch - 48]; //0 ascii is 48
        for(int i=0; i<press.length(); i++){
            Printanswer(ques.substring(1), ans+press.charAt(i), ll);
        }
    }
}
