package Comcorefuncprograms.solve;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args)
    {
        System.out.println("Enter the value of a,b and c");
        Scanner sc= new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        Quadratic ob1 =new Quadratic();
        ob1.QuadCal(a,b,c);
    }
    public void QuadCal(double a,double b, double c)
    {
        double delta = (b*b) - 4*a*c;
        double x1 = (-b + Math.sqrt(delta)/(2*a));
        double x2 = (-b - Math.sqrt(delta)/(2*a));
        System.out.println( x1+" " + x2);
    }
}
