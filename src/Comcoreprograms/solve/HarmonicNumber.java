package Comcoreprograms.solve;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String args[])
    {
        System.out.println("Enter the nth term:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        float harmonic =1;
        for (int i = 2; i <= n; i++) {
            harmonic += (float)1 / i;
        }
        System.out.println("The nth harmonic number is:" + harmonic);
    }

}
