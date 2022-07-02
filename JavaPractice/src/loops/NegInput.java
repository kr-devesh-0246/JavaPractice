//write a program which reads a sequence of positive integers. The program stops when the user fills a negative value
//and shows the maximum and the minimum of these numbers.
//6 0 5 7 -1 -> max = 7, min = 0

package loops;
import java.util.Scanner;

public class NegInput {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = 0;
        int max = 0;
        int min = 0;
        //find out proper looping condition and logic for body of loop(num ka increment soch, if, else, break, sout)
        while(num >= 0){
            System.out.print("Enter an integer: ");
            num = s.nextInt();
            if (num > max)
                max = num;
            if (num < max)
                min = num;
        }
        System.out.print("max = " + max + ", min = " + min);
    }
}
