package com.bridgelabz;

import java.util.Scanner;

public class If_elseQ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if(a==1) {
            System.out.println("one");
        }
        else if(a==10) {
            System.out.println("ten");
        }
        else if(a==100) {
            System.out.println("hundred");
        }
        else if(a==1000) {
            System.out.println("thousand");
        }

    }
}
