package loops;
import java.util.Scanner;
public class ExerciseTwo {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number: ");
            sum += s.nextInt();

            if (sum > 100)
                break;
        }
        System.out.println("Done: " + sum);
    }
}
