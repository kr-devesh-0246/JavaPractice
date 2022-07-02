package arrays;
import java.util.Arrays;
public class BasicSyntaxPractice {
    public static void main(String[] args){
        int[] numbers = {5, 4, 3, 2, 1};
        int[] unicodes = {'A', 'a', 'C', 'c', 'B', 'D', 'b'};
        char[] char1 = {'e', 'b', 'c', 'b', 'a'};
        char[] char2 = {'E', 'D', 'C', 'B', 'A', 'F'};
        char[] char3 = {'A', 'a', 'C', 'c', 'B', 'D', 'b'};
//        boolean[] boolbool = {true, false};
        double[] doub = {1.0, 2.0, 3.0, 3.0, 2.0, 1.0};
        float[] flot = {5.0f, 4.0f, 3.0f, 2.0f};

        //Sorting each one of them
        Arrays.sort(numbers);
        Arrays.sort(unicodes);
        Arrays.sort(unicodes, 3, 7);
        System.out.println(numbers);
        Arrays.sort(char1);
        Arrays.sort(char2);
        Arrays.sort(char3);
//        Arrays.sort(boolbool);
        Arrays.sort(doub);
        Arrays.sort(flot);



    }
}
