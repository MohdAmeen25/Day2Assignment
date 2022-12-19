package com.bridgelabz;

//import java.util.Scanner;

public class for_loopQ2 {
    public static void main(String[] args) {

        int input=12345;
        int reverse=0;
        for( ;input!=0;input=input/10,input++){
            int remainder =input%10;
            reverse=reverse*10+remainder;
        }
            System.out.println(reverse);
    }
}
