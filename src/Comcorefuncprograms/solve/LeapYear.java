package Comcorefuncprograms.solve;

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[])
    {
        System.out.println("Enter a valid four digit year");
        Scanner sc =new Scanner(System.in);
        int year = sc.nextInt();
        if(year>999 && year<10000)
        {
            System.out.println("The year is valid");
        }
        else
        {
            System.out.println("The year is not valid");
        }
        if (year % 4 == 0 && year % 400 == 0 | year % 100 != 0) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }

    }
}
