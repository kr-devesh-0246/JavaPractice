package operators_conditional;

import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args){
//        input read karo
//        int num1 = 3;
//        int num2 = 4;
//        //condition
//        if(num1>num2)
//            System.out.println("num1 is greater");
//        if(num2>num1)
//            System.out.println("num2 is greater");
//        //execute
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        int num1 = s1.nextInt();
        int num2 = s2.nextInt();

        if (num1 > num2 ) {
            System.out.println(num1 + " is greater");
        }
        if (num1<num2) {
            System.out.println(num2 + " is greater");
        }
    }
}