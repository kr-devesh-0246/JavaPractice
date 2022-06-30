/*
Outline:-
->Void method
->Value returning method
->The return keyword
->Calling methods
 */

//The return keyword will directly exit from the method, and no further execution.
//write a method that takes the name of the user and a method that takes the age of the user


package methods;
import java.util.Scanner;
public class NameAge {
    public static void main(String[] args){
        System.out.println(sayName());
        System.out.println(sayAge());
    }
    public static String sayName(){
        System.out.print("Enter name: ");
        return new Scanner(System.in).nextLine();
    }
    public static int sayAge(){
        System.out.print("Enter age: ");
        return new Scanner(System.in).nextInt();
    }
}
