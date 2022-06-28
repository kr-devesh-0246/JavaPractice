//write a program to display  the sum of the digits it reads from the user
// 108 = 1 + 0 + 8

package loops;
import java.util.Scanner;


public class SumOfDigitsInNum {
    public static void main(String[] args){
        System.out.print("Enter an int: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 0;
        int i = 10;
        //looping se ek-ek digit ko extract kar ke sum karte jaayege
        while (num > 0){
            sum += num%i;
            num /= 10;
        }
        System.out.print(sum);
    }
}