package assignment;
//3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){

        Scanner sp = new Scanner(System.in);

        System.out.println("Enter principle: ");
        int p = sp.nextInt();

        System.out.println("Enter rate: ");
        int r = sp.nextInt();

        System.out.println("Enter time");
        int t = sp.nextInt();

        float interest = (p*r*t)/100;
        System.out.println(interest);
    }
}
