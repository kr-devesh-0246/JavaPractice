package loops;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {

        System.out.print("Enter an int: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // prime no - A number which is divisible by One and the number itself.
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                sum += i;

        }
        if (sum == 0)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }
}
