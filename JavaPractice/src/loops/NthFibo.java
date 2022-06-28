package loops;
import java.util.Scanner;
public class NthFibo {
    public static void main (String[] args) {
        System.out.print("Enter n: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //for loop to make a fibonacci sequence
        int a = 1;
        int b = 1;
        int c = a+b;
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        for (int i = 0; i <= n-3; i++){
            System.out.print(c);
            System.out.print(" ");
            a = b;
            b = c;
            c = a + b;
        }

    }
}
