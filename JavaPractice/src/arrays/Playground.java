package arrays;

import java.util.Scanner;
public class Playground {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt(), num2 = in.nextInt();
        isPrimeBetween(num1, num2);
        in.close();
    }
    public static void isPrimeBetween(int num1, int num2) {
        boolean flag = true;
        for (int i = num1; i <= num2; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(i);
            flag = true;
        }
    }
}
