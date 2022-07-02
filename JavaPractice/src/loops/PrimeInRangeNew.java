//write a program to print the prime numbers in the range of two given numbers.
package loops;


public class PrimeInRangeNew {
    public static void main(String[] args) {
        printPrimeNumbers(1, 10);
    }

    public static boolean isPrime(int n) {
//        System.out.print("Enter an int: ");
//        Scanner s = new Scanner(System.in);
//        n = s.nextInt();

        // prime no - A number which is divisible by One and the number itself.
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                sum += i;

        }
        return sum == 0 ;
    }
    public static void printPrimeNumbers(int start, int end){
        for (int i = start; i <= end; i++){
            if(isPrime(i) == true)
                System.out.print(i + " ");
        }
    }
}
