package Comcorefuncprograms.solve;

import java.util.Scanner;

public class TwodArray {
    public static void main(String args[])
    {
        System.out.println("Reading the elements in the array");
        int arr[][]=new int[4][5];
        System.out.println("Enter the M no of rows in the array");
        Scanner sc =new Scanner(System.in);
        int M = sc.nextInt();
        System.out.println("Enter the N no of columns in the array");
        int N =sc.nextInt();
        System.out.println("Enter the elements for row and coloumn in the array:");
        for(int i=0;i<M;i++)
        {
            for(int j =0;j<N;j++)
            {
              arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<M;i++)
        {
            for(int j =0;j<N;j++)
            {
                System.out.println(arr[i][j] + " " );
            }
          System.out.println();
        }



    }

}
