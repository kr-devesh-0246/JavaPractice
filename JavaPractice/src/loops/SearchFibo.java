package loops;

import java.util.Scanner;

public class SearchFibo {
    public static void main (String[] args) {
        System.out.print("Enter n: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        //for loop to make a fibonacci sequence
        int a = 1; int b = 1;
        int c = a+b;

        if (n == 0)
            System.out.println("1st element of fino: " + a);

        else if (n == 1)
            System.out.println("2nd element of fibo: " + b);

        else if (n > 1) {
            for (int i = 1; i <= n - 2; i++) {
                a = b;
                b = c;
                c = a + b;
            }
            System.out.println(n + "th number of the fibonacci sequence: " + c);
        }
    }
}
