//write a program which displays a string spaced after each character.
//ab cd -> a b  c d
//some text -> s o m e  t e x t
//i will use charAt() method
package loops;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ManySpaces {
    public static void  main (String[] args) {
        //taking and storing input
        System.out.print("Enter a string: ");
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();

        String result = "";
        for (int i = 0; i <= string.length()-1; i++){
            result += string.charAt(i);
            result += " ";
        }
        System.out.println(result);

    }
}

