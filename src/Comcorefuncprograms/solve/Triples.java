package Comcorefuncprograms.solve;

import java.util.Scanner;

public class Triples {
    public static void main(String args[]) {
        System.out.println("Enter the no. of integers in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[12];
        int count = 0;
        boolean found = false;
        System.out.println("Enter the no of elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        count++;

                        found = true;

                    }
                }
            }
        }
        if (found == true) {
            System.out.println("The no of triple are:" + count);
        } else {
            System.out.println("The triples does not exist");
        }
    }
}







