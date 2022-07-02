package arrays;
import java.util.Arrays;
public class ArraysClassPrinting {
    public static void main(String[] args) {
        //It returns the string representation for an array
        int[] numbers = {1, 2, 3, 4};
        String[] strings = {"hello", "world", "hello", "java"};
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4] in string format
        //Similarly,
        System.out.println(Arrays.toString(strings)); // [hello, hello, hello] in string format
    }
}
