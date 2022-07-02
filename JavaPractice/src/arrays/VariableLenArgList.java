package arrays;

public class VariableLenArgList {
    public static void main(String[] args){
        System.out.println(sum(1, 7)); // 8
        System.out.println(sum(1, 9, -1)); // 9
        System.out.println(sum(1, 3, -3, 1)); // 2
        System.out.println(sum(0, 1, 99, -1, 2)); // 101

        //Few more examples
        int[] numbers = {1, 7, -2};
        System.out.println(sum(numbers));

        //We can do it anonymously
        System.out.println(sum(new int[] {1,2,3,4}));

        //Upto here we have learned only 1 variable parameter list.
    }
    //3-dots refer to variable arguments
    //the numbers is the array now.
    public static int sum(int... numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length; i++)
            sum += numbers[i];
        return sum;
    }
}
