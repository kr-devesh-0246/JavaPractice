package arrays;
import java.util.Arrays;
public class ArraysClassCompare {
    public static void main(String[] args) {
        //declare few arrays
        int[] num1 = {1, 2, 3};
        int[] num2 = {1, 2, 3};
        int[] num3 = {3, 2, 1};
        int[] num4 = {1, 2, 1};

        // If you try using System.out.println(str1 == str2);, it will compare the address of both parameters
        // Compare analyse the Unicode one element by one if regular fashion

        String[] str1 = {"hello", "hello"};
        String[] str2 = {"hello", "hello"};
        String[] str3 = {"hello", "world"};
        String[] str4 = {"world", "hello"};

        //comparing them using Arrays.compare method
        Arrays.compare(num1, num2); //true
        Arrays.compare(num1, num3); //false
        Arrays.compare(num2, num4); //false

        Arrays.compare(str1, str2); //true
        Arrays.compare(str1, str3); //false
        Arrays.compare(str3, str4); //false
    }
}
