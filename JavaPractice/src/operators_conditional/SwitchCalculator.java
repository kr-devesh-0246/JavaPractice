package operators_conditional;
import java.util.Scanner;
public class SwitchCalculator {
    public static void main(String[] args) {
        System.out.print("Enter num1 operator num2(example: 1 + 2): ");

        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);

        float num1 = s1.nextFloat(); System.out.print(" ");
        String operator = s2.next(); System.out.print(" ");
        float num2 = s3.nextFloat(); System.out.print(" ");

        switch(operator) {
            case ("+"):
                System.out.println(num1 + num2);
                break;
            case ("-"):
                System.out.println(num1 - num2);
                break;
            case ("*"):
                System.out.println(num1 * num2);
                break;
            case ("/"):
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Give the inputs carefully.");
        }
    }
}
