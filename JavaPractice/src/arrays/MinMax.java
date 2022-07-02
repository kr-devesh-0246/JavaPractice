//write a program that displays the maximum and the minimum numbers in an array
package arrays;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        //call methods here
        int[] numbers = {1, 2, 3, 4, 5, 6};
        getMin();
        getMax();
    }
    //define methods here
    public static void getMin() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("min: " + min);
    }
    public static void getMax() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("max: " + max);
    }

}
