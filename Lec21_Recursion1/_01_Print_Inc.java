
import java.util.Scanner;

public class _01_Print_Inc {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            print_Inc(n);
        }
    }

    public static void print_Inc(int n){
        if(n == 0) return;
        print_Inc(n-1);
        System.out.println(n);
    }
}
