//write a program that displays the number of occurence of an element in the array
package arrays;
import java.util.Scanner;
public class Counter {
    public static void main(String[] args) {
        //declare array
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        System.out.print("Enter an int to count its occurence: ");
        Scanner s = new Scanner(System.in);
        int query = s.nextInt();
        int counter = 0;
        for (int i = 0; i < numbers.length; i++){
            if (query == numbers[i]){
                counter++;
            }
        }
        System.out.println(query + " occurs " + counter + " times");
    }
}
