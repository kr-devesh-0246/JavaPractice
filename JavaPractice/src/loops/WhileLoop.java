package loops;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        //read and input until user enter valid input(range(1, 10))
        System.out.print("Enter an int between 1 and 10: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        while (num < 1 || num > 10){
            System.out.print("Enter int in range(1,10): ");
            num = s.nextInt();
        }
        System.out.println("Ok Thank you, it's a valid input:)");
    }
}
