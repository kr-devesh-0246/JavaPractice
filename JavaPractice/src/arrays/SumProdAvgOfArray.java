// write a program that displays the sum, product and average of the elements of an integer array.
package arrays;

public class SumProdAvgOfArray {
    public static void main(String[] args) {
        //declare the array
        //make three methods and call them one by one
        int[] numbers = {1, 2, 3, 4, 5};

        int sum = 0;
        int prod = 1;
        double avg;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            prod *= numbers[i];
        }
        avg = (double) sum / (double) numbers.length;
        System.out.println("sum = " + sum + ", prod = " + prod + ", avg = " + avg);
    }
}
