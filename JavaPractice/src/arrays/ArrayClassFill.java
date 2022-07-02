package arrays;
import java.util.Arrays;
public class ArrayClassFill {
    public static void main(String[] args) {
        //Syntax - fill(array, value): fill the whole array
        int[] numbers1 = new int[8]; // {0, 0, 0, 0, 0, 0, 0, 0}
        Arrays.fill(numbers1, 3);    // {3, 3, 3, 3, 3, 3, 3, 3}

        //Syntax - fill(array, fromIndex, toIndex, value)
        int[] numbers2 = new int[8];    // {0, 0, 0, 0, 0, 0, 0, 0}
        Arrays.fill(numbers2, 3, 7, 5); // {0, 0, 0, 5, 5, 5, 5, 5}

        //Let's learn to fill an array of objects
        String[] strings = new String[3]; //{null, null, null}
        Arrays.fill(strings, "hello");     //{"hello", "hello", "hello"}
        //Same can be done using Points and mixed by slicing indices

    }
}
