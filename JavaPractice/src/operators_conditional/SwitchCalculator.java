package operators_conditional;
import java.util.Scanner;
public class SwitchCalculator {
    public static void main(String[] args) {
        System.out.print("Enter num1 operator num2(example: 1 + 2): ");
// 3-Scanners caused three inputs, i needed only 1 that's issuee+operator object also i didnt declared

        Scanner s = new Scanner(System.in);

        double d1 = s.nextDouble();
        //Important: This is how we read a character from string
        char op = s.next().charAt(0);
        double d2 = s.nextDouble();

        switch (op) {
            case ('+') -> System.out.println(d1 + d2);
            case ('-') -> System.out.println(d1 - d2);
            case ('*') -> System.out.println(d1 * d2);
            case ('/') -> System.out.println(d1 / d2);
            default -> System.out.println("Give the inputs carefully.");
        }
    }
}
