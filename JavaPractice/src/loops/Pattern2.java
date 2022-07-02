//1
//22
//333
//4444

package loops;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
