package operators_conditional;
import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        //read an int
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n % 2 == 0)
            System.out.println("Even");
        if(n % 2 != 0)
            System.out.println("Odd");
    }
}