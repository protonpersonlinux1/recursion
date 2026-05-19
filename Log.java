import java.util.*;
import java.math.*;

public class Log {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Base number: ");
        double x = scn.nextDouble();

        System.out.println("Enter expo: ");
        double n = scn.nextDouble();

        double xpn = Math.pow(x, n);
        System.out.print("Result: " + xpn);

    }
}
