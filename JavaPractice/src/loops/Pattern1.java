package loops;

public class Pattern1 {
    public static void main (String[] args) {
        int i = 5;
        int j = 5;
        for (i = 5; i >= 1; i--){
//            System.out.println("outer loop");
            for (j = 5; j >= i; j-- ){
//                System.out.println("inner loop");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
