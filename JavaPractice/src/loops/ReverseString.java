package loops;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){

        System.out.print("Enter a string: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        //take reverse indexing and store or print the result once
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
