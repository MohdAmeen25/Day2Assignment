package com.bridgelabz;

public class for_loopQ3 {
    public static void main(String[] args) {
        int input=123;
        int reverse=0;
        for( ;input!=0;input=input/10){
            int remainder =input%10;
            reverse=reverse*10+remainder;
        }
            System.out.println(reverse);

    }
}
