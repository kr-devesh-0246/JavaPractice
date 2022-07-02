package datatypes;

public class StringConcatination {
    public static void main(String[] args) {
        //1. Using the simple logic
        String part1 = "Devesh kumar";
        String part2 = "is new to Java programming";
        String full = part1 + " " + part2;

        System.out.println(full);

        //2. Using the plus operator
        System.out.println("My  favourite number is " + 2 + 4 + 6); // Plus operator one by one operates on each number
                                                                    //and make it string then goes to next int.
        //3. Using the concat method
        System.out.println("Devesh ".concat("is healthy ").concat("and fine")); //Devesh is healthy and fine
        System.out.println("Just a line.");
    }
}
