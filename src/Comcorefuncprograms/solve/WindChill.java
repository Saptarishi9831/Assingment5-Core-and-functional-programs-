package Comcorefuncprograms.solve;

import java.util.Scanner;

public class WindChill {
    public static void main(String[]args)
    {
        System.out.println("Enter the value of t in Fahrenheit");
        System.out.println("Enter the value of v in miles per hour");
        Scanner sc =new Scanner(System.in);
        double t = sc.nextDouble();
        double v = sc.nextDouble();
        WindChill ob1=new WindChill();
        ob1.WindCal(t,v);

     }
     public void WindCal(double t, double v)
     {
         double w;
         w = 35.74 +0.6215*t +(0.4275*t-35.75)*(Math.pow(v,0.16));
         System.out.println("The wind chill is:" + w);
     }


}
