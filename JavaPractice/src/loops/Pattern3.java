//     *
//    **
//   ***
//  ****

package loops;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        System.out.print("Enter an integer n: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i <= n; i++){

            for (int j = 1; j <= n-i ; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
