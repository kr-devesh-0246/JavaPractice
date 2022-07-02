package arrays;
//using the binarySearch() method
import java.util.Arrays;

//The Array need not import, for it is by default built in
public class ArrayClassSearch {
    public static void main (String[] args) {
        //declare array
        String[] strings = {"ab", "bc", "cd", "de"};
        //search for an element
        Arrays.binarySearch(strings, "bc"); // true
        Arrays.binarySearch(strings, "ef"); // false
    }
}
