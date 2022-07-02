// Write a program which displays the sum of the strict divisors of an integer given by the user.

package loops;
import java.util.Scanner;
public class ExerciseThree {
    public static void main(String[] args) {

        System.out.print("Enter an int: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
         }
        System.out.println("sum: " + sum);
    }
}
