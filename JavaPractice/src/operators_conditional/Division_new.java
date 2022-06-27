package operators_conditional;

public class Division_new{
    public static void main(String[] args){
        int i1 = 3;
        int i2 = 2;
        double d1 = 2;

        System.out.println(i1 / i2);                    // 1
        System.out.println(i1 / d1);                    // 1.5
        System.out.println((double) i1 / i2);           // 1.5
        System.out.println(i1 / (double) i2);           // 1.5
        System.out.println((double) i1 / (double) i2);  // 1.5
        System.out.println((double) (i1 / i2));         // 1.0
    }
}