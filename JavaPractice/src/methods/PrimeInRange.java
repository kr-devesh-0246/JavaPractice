//write a program that prints the prime numbers between two numbers.
//try to correct this logic
package methods;
import java.util.Scanner;
public class PrimeInRange {
    public static void main(String[] args){
        //call methods and do formatting
        System.out.println("Prime numbers in given range: ");
        Prime();
    }
    public static void Prime() {
        System.out.print("Enter n1: ");
        Scanner s1 = new Scanner(System.in);
        int n1 = s1.nextInt();

        System.out.print("Enter n2: ");
        Scanner s2 = new Scanner(System.in);
        int n2 = s2.nextInt();

        //constraints care
        if (n2 > n1) {
            //main logic

            System.out.println("condition: n2>n1");
            for (int i = n1; i <= n2; i++) {
                //check i is prime or not, if true: print with spaces in between
                //only find out why each i is printing
                boolean flag = true;
                for (int j = 1; j <= n1; j++) {
                    if (i % j != 0)
                        flag = false;
                }if(flag == true)
                    System.out.print(i + " ");
            }
        }
        //segment working fine.
        else if (n1 == n2) {
            //check that n1 is prime or not, if yes print itself
            System.out.println("condition: n1 == n2");
            boolean flag = true;
            for (int i = 1; i <= n1; i++) {
                if (n1 % i != 0)
                    flag = false;

            }
            if (flag ==true)
                System.out.print( n1 + " ");

        }
        //segment working fine
        else
            System.out.println("Please enter n2 > n1");


    }
}
