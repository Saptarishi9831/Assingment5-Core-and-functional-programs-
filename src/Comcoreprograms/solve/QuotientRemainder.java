package Comcoreprograms.solve;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String args[])
    {
        System.out.println("Enter a dividend");
        Scanner sc = new Scanner(System.in);
        int div = sc.nextInt();
        System.out.println("Enter a divisor");
        int divs = sc.nextInt();
        int quotient = div/divs;
        int remainder = div%divs;
        System.out.println("The quotient =" + quotient);
        System.out.println("The remainder=" + remainder);

    }
}
