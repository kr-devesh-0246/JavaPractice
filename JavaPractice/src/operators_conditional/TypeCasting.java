package operators_conditional;

public class TypeCasting {
    public static void main(String[] args){
        //happens when converting a data type to another
        //It is of two types: Implicit and Explicit
        //Implicit-narrow to wider range data type(When conversion does not lose data), (Happens automatically by java)
        //Explicit-wider to narrower range data type(When it might lose some data), (Programmers does it)
        //Range order:- long > float > double > int > short > byte (Check the order again)
//Implicit
        double d1 = 4;     // int -> double
        double d2 = 3.0f;  // float -> double
        long l1 = 100;     // int -> long
//Explicit
        //(new data type) expression
        int i1 = (int) 4.5f;
        int i2 = (int) 9L ;
        float f1 = (float) 4.5;
    }
}
