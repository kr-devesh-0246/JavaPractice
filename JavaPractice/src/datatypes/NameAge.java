package datatypes;
import java.util.Scanner;
public class NameAge {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        Scanner age = new Scanner(System.in);

        System.out.print("Enter your name and age: ");
        System.out.println(name.nextLine() + "You are "+ age.nextInt() + " years old buddy.");

    }
}
