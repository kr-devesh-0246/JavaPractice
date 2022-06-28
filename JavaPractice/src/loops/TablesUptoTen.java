package loops;

public class TablesUptoTen {
    public static void main(String[] args) {
        //Table upto ten
        for (int i = 1; i<=10; i++) {
            for (int j = 1; j<=10; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
