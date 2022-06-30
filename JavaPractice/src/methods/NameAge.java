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
        sayName();
        sayAge();
    }
    public static void sayName(){
        System.out.print("Enter name: ");
        Scanner s_name = new Scanner(System.in);
        String name = s_name.nextLine();

        System.out.println(name);
    }
    public static void sayAge(){
        System.out.print("Enter age: ");
        Scanner s_age = new Scanner(System.in);
        int age = s_age.nextInt();

        System.out.println(age);
    }
}
