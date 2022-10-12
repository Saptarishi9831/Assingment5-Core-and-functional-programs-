package Comcoreprograms.solve;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String args[])
    {
        System.out.println("Enter the no of times you want to flip coin:");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int Tcount=0;
        int Hcount=0;
       double fliprandom = (double) (Math.random()*2 );
       for(int i=0;i<t;i++) {
           if (fliprandom == 0 && fliprandom<0.5) {
               System.out.println("Tails");
               Tcount++;
           } else if(fliprandom>=0.5) {
               System.out.println("Heads");
               Hcount++;
           }
       }
           double percentage1 = (Hcount/t) *100;
           double percentage2 = (Tcount/t) *100;
           System.out.println("The percentage of heads is:" + percentage1);
        System.out.println("The percentage of tails is:" + percentage2);

    }


    }

