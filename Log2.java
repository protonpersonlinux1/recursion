import java.util.*;

public class Log2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Base number: ");
        int  x = scn.nextInt();

        System.out.println("Enter expo: ");
        int  n = scn.nextInt();

        int  xpn = power(x, n);
        System.out.println("result: " + xpn);
    }

    public static int  power(int x, int n) {
        if(n == 0){
           return 1;
        }
        int  xpnb = power(x, n / 2);

        int  xn = xpnb * xpnb;

        if(n % 2 == 1) {
            xn = xn * x;
        }
        return xn;
    }
}
