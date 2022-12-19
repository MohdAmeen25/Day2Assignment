package com.bridgelabz;

import java.util.Scanner;

public class while_loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (a>0) {
            int remainder = a % 10;
            System.out.print(remainder);
            a = a / 10;
        }
    }
}
