package assignment;
import java.util.Scanner;
//1. Write a program to print whether a number is even or odd, also take
//input from the user.
public class EvenOdd {
    public static void main(String[] args){
        //take user input
        System.out.print("Enter an integer: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
