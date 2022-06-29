//check neso code learn it well
//output remains false always:)
package loops;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){

        System.out.print("Enter a string: ");
        Scanner s = new Scanner(System.in);
        String str = s.next();

        String rev = "";
        for (int i = str.length()-1; i >= 0; i--){
            rev += str.charAt(i);
        }
        System.out.println(str);
        System.out.println(rev);
        System.out.print((str == rev) ? true : false);
    }
}
