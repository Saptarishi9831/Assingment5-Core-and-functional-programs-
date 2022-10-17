package Comcorefuncprograms.solve;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args)
    {
        double x,y;
       System.out.println("Enter the value of x and y");
        Scanner sc= new Scanner(System.in);
        x= sc.nextDouble();
        y= sc.nextDouble();
        Distance ob1= new Distance();
        ob1.disCal(x,y);
    }

    public void disCal(double x ,double y)
    {
        double disresult = Math.sqrt((x*x) + (y*y));
        System.out.println("The Euclidean distance from the origin(0,0)" + disresult);

    }
}
