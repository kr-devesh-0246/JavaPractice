//ArrayList-It is a resizable array
/*In an ArrayList, we can store objects(String,Integer, Boolean,...), not
 a primitive type(int, boolean, double, char)*/
package arrays;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main (String[] args) {
        //declaring
        ArrayList<Integer> integers ; // uninitialized: null
        //initializing
        integers = new ArrayList<>();
        //both declaring & initialising
        ArrayList<Integer> integers2 = new ArrayList<>();
        //Similarly
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();

        //Adding items (using add() method), it appends the element at the end.
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Strawberry");
        System.out.println(fruits); // [Apple, Banana, Guava, Strawberry]

        //Using index
        fruits.add(0, "At index 0");
        System.out.println(fruits); //[At index 0, Apple, Banana, Guava, Strawberry]
        fruits.add(2, "At index 2");
        System.out.println(fruits); //[At index 0, Apple, At index 2, Banana, Guava, Strawberry]

        //Accessing an element (using the get() method)
        fruits.get(0); // At index 0
        fruits.get(1); // Apple
        fruits.get(2); // At index 2

        //Change an Item (using the set() method)
        fruits.set(0, "first fruit"); // change Strawberry to Orange
        System.out.println(fruits);   // [first fruit, Apple, At index 2, Banana, Guava, Strawberry]

        //Remove an Item
        fruits.remove(0);
        System.out.println(fruits);

        fruits.remove("At index 2");
        System.out.println(fruits);

        //Size (using the size() method)
        fruits.size(); // 4

        //looping through an ArrayList
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");
        }
        System.out.println();

        //Sort an ArrayList(Using sort method of Collections class)
        System.out.println(fruits);
        fruits.set(2, "Apple");
        System.out.println(fruits);
        fruits.set(0, "Guava");
        System.out.println(fruits);
        Collections.sort(fruits);
        System.out.println(fruits); //Sorted

    }
}
