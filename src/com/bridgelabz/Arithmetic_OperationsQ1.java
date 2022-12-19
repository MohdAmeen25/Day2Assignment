package com.bridgelabz;

import java.util.Scanner;

public class Arithmetic_OperationsQ1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter value a");
        int a=input.nextInt();
        System.out.println("Enter value b");
        int b=input.nextInt();
        System.out.println("Enter value c");
        int c=input.nextInt();

        System.out.println("a = " + a+b*c);
        System.out.println("b = " + c+a/b);
        System.out.println("c = " + a%b+c);
        System.out.println("d = " + a*b+c);
    }
}
