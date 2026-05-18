import java.util.Scanner;
import java.math.*;

public class Factorial {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Number: ");
        BigInteger n = scn.nextBigInteger();

        System.out.println("factorial of " + n + " is " + factorial(n));

        scn.close();
    }

    public static int factorial(double n){
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
