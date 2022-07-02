package datatypes;

import java.util.Scanner;
public class VariousInputs {
    public static void main(String[] args) {
        //initiating and declaring various data type objects
        Scanner str_inp1 = new Scanner(System.in);
        Scanner str_inp2 = new Scanner(System.in);
        Scanner bool_inp = new Scanner(System.in);
        Scanner int_inp = new Scanner(System.in);
        Scanner float_inp = new Scanner(System.in);
        Scanner double_inp = new Scanner(System.in);

        //Outputting those objects
        System.out.print("Enter a word: ");
        System.out.println("This is inputted word: " + str_inp1.next());

        System.out.print("Enter a sentence: ");
        System.out.println("This is inputted word: " + str_inp2.nextLine());

        System.out.print("Enter a bool: ");
        System.out.println("This is inputted bool: " + bool_inp.nextBoolean());

        System.out.print("Enter an int input: ");
        System.out.println("This is inputted int: " + int_inp.nextInt());

        System.out.print("Enter float: ");
        System.out.println("This is inputted float: " + float_inp.nextFloat());

        System.out.print("Enter a double: ");
        System.out.println("This is inputted double: " + double_inp.nextDouble());
    }
}
