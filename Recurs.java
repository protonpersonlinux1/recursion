package Recursion;
import java.util.*;
import java.io.*;

public class Recurs {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);

        System.out.print("Number: ");
        int n = scn.nextInt();

        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n == 0) return;

        System.out.println(n);

        printDecreasing(n - 1);
    }
}
