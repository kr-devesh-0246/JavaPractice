package operators_conditional;
import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        //Lucky no - ABCD is lucky if A+B == C+D
        System.out.print("Enter a four digit integer: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        //convert the string to num for if condition

        if (  num > 9999 ||  num < 1000 ) {
            System.out.println("Enter a 4 digit int: ");
        }
        else {
            int d = (num / 1) % 10;
            int c = (num / 10) % 10;
            int b = (num / 100) % 10;
            int a = (num / 1000) % 10;

            System.out.println(a+b == c+d ? "Lucky number" : "Not a lucky number");

        }
    }
}
