package operators_conditional;

import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args){
        //Method-1(Using variable input)

//        int num1 = 3;
//        int num2 = 4;
//        //condition
//        if(num1>num2)
//            System.out.println("num1 is greater");
//        if(num2>num1)
//            System.out.println("num2 is greater");
//        //execute

        //Method-2(Using user input)
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = s1.nextInt();
        System.out.print("Enter num2: ");
        int num2 = s2.nextInt();

        if (num1 > num2 ) {
            System.out.println(num1 + " is greater");
        }
        if (num1<num2) {
            System.out.println(num2 + " is greater");
        }
    }
}