package arrays;
import java.awt.*;
import java.util.Arrays;
public class ArraysClassEquals {
    public static void main(String[] args) {
        //declare arrays
        String[] strings1 = {"ab", "bc", "cd"};
        String[] strings2 = {"ab", "bc", "cd"};
        //Let's try using sout
        System.out.println(strings1 == strings2); //false
        System.out.println(Arrays.equals(strings1, strings2)); //true

        //Similarly for Points
        Point[] points1 = {new Point(1, 2), new Point(3, 4)};
        Point[] points2 = {new Point(1, 2), new Point(3, 4)};
        Point[] points3 = {new Point(0, 0), new Point(1, 1)};

        //Let's try comparing using the system output
        System.out.println(points1 == points2); //false
        System.out.println(Arrays.equals(points1, points2)); //true, after comparing it element by element
        System.out.println(Arrays.equals(points1, points3)); //false

        //Note on equals:-
        //There is an equals method builtin in the objects (primitive)
        //Example
        String str1 = new String("Hello Java");
        String str2 = new String("Hello Java");

        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2)); //true

        //Similarly for Point data types
        //Example
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(3, 4);

        System.out.println(p1 == p2); //false
        System.out.println(p1.equals(p2)); //true
        System.out.println(p1.equals(p3)); //false
    }
}
