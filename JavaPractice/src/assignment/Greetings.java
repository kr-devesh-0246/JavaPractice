package assignment;
//2. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Greetings of the day: " + name);
    }
}
