package operators_conditional;

import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        //Lucky no - ABCD is lucky if A+B == C+D
        System.out.print("Enter a four digit integer: ");
        Scanner s = new Scanner(System.in);
        String num = s.next();
        int a = num.charAt(0);
        int b = num.charAt(1);
        int c = num.charAt(2);
        int d = num.charAt(3);

        System.out.println(a+b == c+d ? "Lucky number" : "Not a lucky number");

    }
}
