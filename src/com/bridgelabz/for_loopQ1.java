package com.bridgelabz;

import java.util.Scanner;

public class for_loopQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int sum=0;
        System.out.println("Enter value");
        for (int i = 1; i<= n; i++) {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.print ("total is " + sum);
//        System.out.println(sum);
    }
}