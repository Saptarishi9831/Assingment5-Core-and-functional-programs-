package Comcorefuncprograms.solve;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String args[]) {
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("a is the largest" + a);
        } else if (b > a && b > c) {
            System.out.println("b is the largest" + b);
        } else if (c > a && c > b) {
            System.out.println("c is the largest" + c);
        }
    }
}




