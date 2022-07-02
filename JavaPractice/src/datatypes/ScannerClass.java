package datatypes;

import java.util.Scanner;
public class ScannerClass {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        //string
//        System.out.print("Enter your name: ");
//        System.out.println("This is your name: " + input.nextLine());
        //bool
//        System.out.print("Enter a bool: ");
//        System.out.println("This is your bool: " + input.nextBoolean());
        //int
        System.out.print("Enter an int: ");
        System.out.println("This is an int: " + input.nextInt());
    }
}
