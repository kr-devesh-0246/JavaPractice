package operators_conditional;

public class Division {
    public static void main(String[] args){
        int i1 = 1/2;               //Ok, int = int
        int i2 = 1.0/ 2;            //ERROR, int = double
        int i3 = (int) (1.0/ 2 );   //OK, int = int
        int i4 = (int) (1.0f/ 2);   //OK, int = int
        int i5 = (int) 1.0f / 2;    //OK, int = int
        int i6 = 1.0f /(int) 2;     //ERROR, int = float
        double i7 = 1.0 / 2;        //OK, int = glo
        double i8 = 1 / 2;          //OK, double = int
        double i9 = (double) 1 / 2; //OK, double = double
        float i10 = 1.0f / 2.0f;    //OK, float = float
        float i11 = 1 / 2;          //Ok, float = int


    }
}