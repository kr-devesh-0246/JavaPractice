//write a program that places all the odd elements before the even elements
package arrays;

import java.util.Arrays;

public class OddsBeforeEvens {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        //L-1: Seperate the even and odd first insert odds then even
        int i = 0;
        int[] temp = new int[numbers.length];
        int j = 0; int k = numbers.length - 1;
        for (i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0)
                temp[j++] = numbers[i];
            else
                temp[k--] = numbers[i];
        }
        copyArray(temp, numbers);
        System.out.println(Arrays.toString(numbers));
    }
    private static void copyArray(int[] temp, int[] numbers){
        for(int i = 0; i < temp.length; i++)
            numbers[i] = temp[i];
    }
}
