// write a program that fills an array with n integers entered by user
package arrays;
import java.util.Scanner;
public class Playground {
    public static void main(String[] args) {

        System.out.print("Enter n: ");
        Scanner s = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);
        int n = s.nextInt();

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            result[i] = inp.nextInt();
        }

        //Printing the array
        for (int i = 0; i < n; i++)
            System.out.print(result[i] + " ");
    }
}