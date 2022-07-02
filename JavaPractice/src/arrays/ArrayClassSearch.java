package arrays;
//using the binarySearch() method
import java.util.Arrays;

public class ArrayClassSearch {
    public static void main (String[] args) {
        //declare array
        String[] strings = {"ab", "bc", "cd", "de"};
        //search for an element
        Arrays.binarySearch(strings, "bc"); // true
        Arrays.binarySearch(strings, "ef"); // false
    }
}
