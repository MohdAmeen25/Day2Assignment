package com.bridgelabz;

import java.util.Scanner;

public class while_loop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int n=sc.nextInt();
        int i = 1;
        int sum=0;
        while (i<=n) {
            sum=sum+ i;
            i++;
        }
        System.out.println("Sum of "+n+" numbers is :"+sum);
    }
}

